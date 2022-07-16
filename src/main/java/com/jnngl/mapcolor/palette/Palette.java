/*
 *  Library for converting colors and images into Minecraft map colors
 *  Copyright (C) 2022  JNNGL
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.jnngl.mapcolor.palette;

import java.awt.*;

public interface Palette {

   Palette117 NEWEST_PALETTE = new Palette117();
   Palette116 PALETTE_1_16 = new Palette116();
   Palette112 PALETTE_1_12 = new Palette112();
   Palette181 PALETTE_1_8_1 = new Palette181();
   Palette172 PALETTE_1_7_2 = new Palette172();
   OriginalPalette ORIGINAL_PALETTE = new OriginalPalette();

   static Palette getPaletteForProtocol(int protocol) {
      if (protocol < 1) {
         return Palette.ORIGINAL_PALETTE;
      } else if (protocol < 47) {
         return Palette.PALETTE_1_7_2;
      } else if (protocol < 324) {
         return Palette.PALETTE_1_8_1;
      } else if (protocol < 730) {
         return Palette.PALETTE_1_12;
      } else if (protocol < 755) { // May be incorrect
         return Palette.PALETTE_1_16;
      } else {
         return Palette.NEWEST_PALETTE;
      }
   }

   static Palette getPaletteForVersion(String version) {
      int id = Integer.parseInt(version.replaceAll("\\D*", ""));
      String[] split = version.split("\\.");
      if (split.length == 2) {
         id *= 100;
      } else if (split[2].length() < 2) {
         id *= 10;
      }
      if (id < 1700) {
         return Palette.ORIGINAL_PALETTE;
      } else if (id < 1810) {
         return Palette.PALETTE_1_7_2;
      } else if (id < 11200) {
         return Palette.PALETTE_1_8_1;
      } else if (id < 11600) {
         return Palette.PALETTE_1_12;
      } else if (id < 11700) {
         return Palette.PALETTE_1_16;
      } else {
         return Palette.NEWEST_PALETTE;
      }
   }

   static int[] getColorsRGB(Color[] palette) {
      int[] ints = new int[palette.length];
      for (int i = 0; i < palette.length; i++) {
         ints[i] = palette[i].getRGB();
      }
      return ints;
   }

   static Color shadeColor(Color color, int multiplier) {
      return new Color((color.getRed() * multiplier) / 255,
                       (color.getGreen() * multiplier) / 255,
                       (color.getBlue() * multiplier) / 255,
                           color.getAlpha());
   }

   static Color shadeColor(Color color, float multiplier) {
      float[] rgb = new float[3];
      color.getRGBColorComponents(rgb);
      return new Color((int) Math.floor(rgb[0] * multiplier * 255),
                       (int) Math.floor(rgb[1] * multiplier * 255),
                       (int) Math.floor(rgb[2] * multiplier * 255), color.getAlpha());
   }

   static Color[] shadeColors(Color[] colors, float[] multipliers) {
      Color[] shaded = new Color[colors.length * multipliers.length];
      for (int i = 0; i < colors.length; i++) {
         Color baseColor = colors[i];
         int baseIndex = i * multipliers.length;
         for (int j = 0; j < multipliers.length; j++) {
            shaded[baseIndex + j] = shadeColor(baseColor, multipliers[j]);
         }
      }
      return shaded;
   }

   static Color[] shadeColors(Color[] colors, int[] multipliers) {
      Color[] shaded = new Color[colors.length * multipliers.length];
      for (int i = 0; i < colors.length; i++) {
         Color baseColor = colors[i];
         int baseIndex = i * multipliers.length;
         for (int j = 0; j < multipliers.length; j++) {
            shaded[baseIndex + j] = shadeColor(baseColor, multipliers[j]);
         }
      }
      return shaded;
   }

   Color[] getColors();
   int[] getIntColors();
   byte getDarkestColorIndex();
   byte getBrightestColorIndex();
   int length();

   default Color getDarkestColor() {
      return this.getColorAt(this.getDarkestColorIndex());
   }

   default Color getBrightestColor() {
      return this.getColorAt(this.getBrightestColorIndex());
   }

   default Color getColorAt(byte index) {
      return this.getColors()[this.toIndex(index)];
   }

   default int numShades() {
      return 4;
   }

   default int unshadedIndex() {
      return 2;
   }

   default byte baseColorIndex(byte id) {
      return (byte) (Byte.toUnsignedInt(id) * this.numShades());
   }

   default byte unshadedColorIndex(byte id) {
      return (byte) (this.baseColorIndex(id) + this.unshadedIndex());
   }

   default Color baseColor(byte id) {
      return this.getColorAt(this.unshadedColorIndex(id));
   }

   default float[] getMultiplierFloats() {
      return new float[] { 0.71f, 0.86f, 1.f, 0.53f };
   }

   default int[] getMultipliers() {
      return new int[] { 180, 220, 255, 135 };
   }

   default Color getShadedColor(byte id, int multiplierIndex) {
      return this.getShadedColor(this.baseColor(id), multiplierIndex);
   }

   default int toIndex(byte index) {
      int unsigned = Byte.toUnsignedInt(index);
      if (unsigned >= this.length()) {
         return 0;
      }
      return unsigned;
   }

   default Color getShadedColor(Color color, int multiplierIndex) {
      if (multiplierIndex < 0 || multiplierIndex >= this.numShades()) {
         return this.getColorAt((byte) 0);
      }
      return shadeColor(color, this.getMultipliers()[multiplierIndex]);
   }

   default byte baseID(byte index) {
      return (byte) (Byte.toUnsignedInt(index) / this.numShades());
   }

   default byte floorToBaseIndex(byte index) {
      return this.baseColorIndex(this.baseID(index));
   }

   default byte unshadeIndex(byte index) {
      return (byte) (this.floorToBaseIndex(index) + this.unshadedIndex());
   }

   default Color unshade(byte index) {
      return this.getColorAt(this.unshadeIndex(index));
   }

   default Color[] unshadeColors(Color[] colors) {
      Color[] unshaded = new Color[colors.length / this.numShades()];
      for (byte i = 0; i < unshaded.length; i++) {
         unshaded[i] = this.baseColor(i);
      }
      return unshaded;
   }

   default Color[] baseColors() {
      return this.unshadeColors(this.getColors());
   }

   default int getIntColorAt(byte index) {
      return this.getIntColors()[this.toIndex(index)];
   }

}
