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

public class OriginalPalette implements Palette {

   public static final byte DARKEST = 18;
   public static final byte BRIGHTEST = 23;

   private static final Color[] palette;
   private static final int[] intPalette;

   protected OriginalPalette() {}

   @Override
   public Color[] getColors() {
      return palette;
   }

   @Override
   public int[] getIntColors() {
      return intPalette;
   }

   @Override
   public byte getDarkestColorIndex() {
      return DARKEST;
   }

   @Override
   public byte getBrightestColorIndex() {
      return BRIGHTEST;
   }

   @Override
   public int length() {
      return palette.length;
   }

   @Override
   public int numShades() {
      return 3;
   }

   @Override
   public float[] getMultiplierFloats() {
      return new float[] { 0.71f, 0.86f, 1.f };
   }

   @Override
   public int[] getMultipliers() {
      return new int[] { 180, 220, 255 };
   }

   static {
      palette = new Color[] {
              new Color(0, 0, 0, 0), // Base 1
              new Color(0, 0, 0, 0),
              new Color(0, 0, 0, 0),
              new Color(89, 125, 39), // Base 2
              new Color(109, 153, 48),
              new Color(127, 178, 56),
              new Color(174, 164, 115), // Base 3
              new Color(213, 201, 140),
              new Color(247, 233, 163),
              new Color(180, 0, 0), // Base 4
              new Color(220, 0, 0),
              new Color(255, 0, 0),
              new Color(112, 112, 180), // Base 5
              new Color(138, 138, 220),
              new Color(160, 160, 255),
              new Color(117, 117, 117), // Base 6
              new Color(144, 144, 144),
              new Color(167, 167, 167),
              new Color(0, 87, 0), // Base 7
              new Color(0, 106, 0),
              new Color(0, 124, 0),
              new Color(180, 180, 180), // Base 8
              new Color(220, 220, 220),
              new Color(255, 255, 255),
              new Color(115, 118, 129), // Base 9
              new Color(141, 144, 158),
              new Color(164, 168, 184),
              new Color(129, 74, 33), // Base 10
              new Color(157, 91, 40),
              new Color(183, 106, 47),
              new Color(79, 79, 79), // Base 11
              new Color(96, 96, 96),
              new Color(112, 112, 112),
              new Color(45, 45, 180), // Base 12
              new Color(55, 55, 220),
              new Color(64, 64, 255),
              new Color(73, 58, 35), // Base 13
              new Color(89, 71, 43),
              new Color(104, 83, 50),
      };

      intPalette = Palette.getColorsRGB(palette);
   }

   public static final byte TRANSPARENT_ID = 0;
   public static final byte GRASS_ID = 1;
   public static final byte SAND_ID = 2;
   public static final byte FIRE_ID = 3;
   public static final byte ICE_ID = 4;
   public static final byte WOOL_ID = 5;
   public static final byte PLANT_ID = 6;
   public static final byte SNOW_ID = 7;
   public static final byte CLAY_ID = 8;
   public static final byte DIRT_ID = 9;
   public static final byte STONE_ID = 10;
   public static final byte WATER_ID = 11;
   public static final byte WOOD_ID = 12;

}
