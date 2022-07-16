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

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

class PaletteTest {

   @Test
   public void protocolVersionTest() {
      Assertions.assertInstanceOf(OriginalPalette.class, Palette.getPaletteForProtocol(0));
      Assertions.assertInstanceOf(Palette172.class, Palette.getPaletteForProtocol(1));
      Assertions.assertInstanceOf(Palette172.class, Palette.getPaletteForProtocol(2));
      Assertions.assertInstanceOf(Palette172.class, Palette.getPaletteForProtocol(46));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForProtocol(47));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForProtocol(48));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForProtocol(323));
      Assertions.assertInstanceOf(Palette112.class, Palette.getPaletteForProtocol(324));
      Assertions.assertInstanceOf(Palette112.class, Palette.getPaletteForProtocol(325));
      Assertions.assertInstanceOf(Palette112.class, Palette.getPaletteForProtocol(729));
      Assertions.assertInstanceOf(Palette116.class, Palette.getPaletteForProtocol(730));
      Assertions.assertInstanceOf(Palette116.class, Palette.getPaletteForProtocol(731));
      Assertions.assertInstanceOf(Palette116.class, Palette.getPaletteForProtocol(754));
      Assertions.assertInstanceOf(Palette117.class, Palette.getPaletteForProtocol(755));
      Assertions.assertInstanceOf(Palette117.class, Palette.getPaletteForProtocol(756));
   }

   @Test
   public void stringVersionTest() {
      Assertions.assertInstanceOf(OriginalPalette.class, Palette.getPaletteForVersion("1.6"));
      Assertions.assertInstanceOf(OriginalPalette.class, Palette.getPaletteForVersion("1.6.4"));
      Assertions.assertInstanceOf(Palette172.class, Palette.getPaletteForVersion("1.7"));
      Assertions.assertInstanceOf(Palette172.class, Palette.getPaletteForVersion("1.7.2"));
      Assertions.assertInstanceOf(Palette172.class, Palette.getPaletteForVersion("1.7.4"));
      Assertions.assertInstanceOf(Palette172.class, Palette.getPaletteForVersion("1.7.5"));
      Assertions.assertInstanceOf(Palette172.class, Palette.getPaletteForVersion("1.7.6"));
      Assertions.assertInstanceOf(Palette172.class, Palette.getPaletteForVersion("1.7.8"));
      Assertions.assertInstanceOf(Palette172.class, Palette.getPaletteForVersion("1.7.9"));
      Assertions.assertInstanceOf(Palette172.class, Palette.getPaletteForVersion("1.7.10"));
      Assertions.assertInstanceOf(Palette172.class, Palette.getPaletteForVersion("1.8"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.8.1"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.8.2"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.8.3"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.8.4"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.8.5"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.8.6"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.8.7"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.8.8"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.8.9"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.9"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.9.1"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.9.2"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.9.3"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.9.4"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.10"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.10.1"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.10.2"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.11"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.11.1"));
      Assertions.assertInstanceOf(Palette181.class, Palette.getPaletteForVersion("1.11.2"));
      Assertions.assertInstanceOf(Palette112.class, Palette.getPaletteForVersion("1.12"));
      Assertions.assertInstanceOf(Palette112.class, Palette.getPaletteForVersion("1.12.1"));
      Assertions.assertInstanceOf(Palette112.class, Palette.getPaletteForVersion("1.12.2"));
      Assertions.assertInstanceOf(Palette112.class, Palette.getPaletteForVersion("1.13"));
      Assertions.assertInstanceOf(Palette112.class, Palette.getPaletteForVersion("1.13.1"));
      Assertions.assertInstanceOf(Palette112.class, Palette.getPaletteForVersion("1.13.2"));
      Assertions.assertInstanceOf(Palette112.class, Palette.getPaletteForVersion("1.14"));
      Assertions.assertInstanceOf(Palette112.class, Palette.getPaletteForVersion("1.14.1"));
      Assertions.assertInstanceOf(Palette112.class, Palette.getPaletteForVersion("1.14.2"));
      Assertions.assertInstanceOf(Palette112.class, Palette.getPaletteForVersion("1.14.3"));
      Assertions.assertInstanceOf(Palette112.class, Palette.getPaletteForVersion("1.14.4"));
      Assertions.assertInstanceOf(Palette112.class, Palette.getPaletteForVersion("1.15"));
      Assertions.assertInstanceOf(Palette112.class, Palette.getPaletteForVersion("1.15.2"));
      Assertions.assertInstanceOf(Palette116.class, Palette.getPaletteForVersion("1.16"));
      Assertions.assertInstanceOf(Palette116.class, Palette.getPaletteForVersion("1.16.1"));
      Assertions.assertInstanceOf(Palette116.class, Palette.getPaletteForVersion("1.16.2"));
      Assertions.assertInstanceOf(Palette116.class, Palette.getPaletteForVersion("1.16.3"));
      Assertions.assertInstanceOf(Palette116.class, Palette.getPaletteForVersion("1.16.4"));
      Assertions.assertInstanceOf(Palette116.class, Palette.getPaletteForVersion("1.16.5"));
      Assertions.assertInstanceOf(Palette117.class, Palette.getPaletteForVersion("1.17"));
      Assertions.assertInstanceOf(Palette117.class, Palette.getPaletteForVersion("1.17.1"));
      Assertions.assertInstanceOf(Palette117.class, Palette.getPaletteForVersion("1.18"));
      Assertions.assertInstanceOf(Palette117.class, Palette.getPaletteForVersion("1.18.1"));
      Assertions.assertInstanceOf(Palette117.class, Palette.getPaletteForVersion("1.18.2"));
      Assertions.assertInstanceOf(Palette117.class, Palette.getPaletteForVersion("1.19"));
      Assertions.assertInstanceOf(Palette117.class, Palette.getPaletteForVersion("1.19.1"));
   }

   @Test
   public void paletteTest() {
      Palette palette = Palette.NEWEST_PALETTE;
      Assertions.assertEquals(8, palette.baseColorIndex((byte) 2));
      Assertions.assertEquals(10, palette.unshadedColorIndex((byte) 2));
      Assertions.assertEquals(palette.getColorAt((byte) 10), palette.baseColor((byte) 2));
      Color[] reshaded = Palette.shadeColors(palette.baseColors(), palette.getMultipliers());
      Assertions.assertArrayEquals(reshaded, palette.getColors());
      for (int i = 0; i < palette.length(); i++) {
         Assertions.assertEquals(palette.getIntColorAt((byte) i), palette.getColorAt((byte) i).getRGB());
      }
      Assertions.assertEquals(palette.baseColor(Palette117.SNOW_ID), palette.unshade((byte) (palette.baseColorIndex(Palette117.SNOW_ID) + 1)));
      Assertions.assertEquals(palette.getColorAt((byte) 237), palette.getShadedColor(Palette117.DEEPSLATE_ID, 1)); // 237 = 59 * 4 +
   }

   @Test
   public void palette1_17Test() {
      Palette palette = Palette.NEWEST_PALETTE;
      Assertions.assertEquals(4, palette.numShades());
      Assertions.assertArrayEquals(new float[] { 0.71f, 0.86f, 1.f, 0.53f }, palette.getMultiplierFloats());
      Assertions.assertArrayEquals(new int[] { 180, 220, 255, 135 }, palette.getMultipliers());
      int actualDarkestSum = 255 * 3;
      byte actualDarkestId = 0;
      for (int i = palette.numShades(); i < palette.length(); i++) {
         Color c = palette.getColorAt((byte) i);
         int sum = c.getRed() + c.getGreen() + c.getBlue();
         if(sum < actualDarkestSum) {
            actualDarkestSum = sum;
            actualDarkestId = (byte) i;
         }
      }
      Color darkest = palette.getDarkestColor();
      Assertions.assertEquals(actualDarkestSum, darkest.getRed() + darkest.getGreen() + darkest.getBlue());
      Assertions.assertEquals(actualDarkestId, palette.getDarkestColorIndex());
      int actualBrightestSum = 0;
      byte actualBrightestId = 0;
      for (int i = palette.numShades(); i < palette.length(); i++) {
         Color c = palette.getColorAt((byte) i);
         int sum = c.getRed() + c.getGreen() + c.getBlue();
         if(sum > actualBrightestSum) {
            actualBrightestSum = sum;
            actualBrightestId = (byte) i;
         }
      }
      Color brightest = palette.getBrightestColor();
      Assertions.assertEquals(actualBrightestSum, brightest.getRed() + brightest.getGreen() + brightest.getBlue());
      Assertions.assertEquals(actualBrightestId, palette.getBrightestColorIndex());
   }

   @Test
   public void palette1_16Test() {
      Palette palette = Palette.PALETTE_1_16;
      Assertions.assertEquals(4, palette.numShades());
      Assertions.assertArrayEquals(new float[] { 0.71f, 0.86f, 1.f, 0.53f }, palette.getMultiplierFloats());
      Assertions.assertArrayEquals(new int[] { 180, 220, 255, 135 }, palette.getMultipliers());
      int actualDarkestSum = 255 * 3;
      byte actualDarkestId = 0;
      for (int i = palette.numShades(); i < palette.length(); i++) {
         Color c = palette.getColorAt((byte) i);
         int sum = c.getRed() + c.getGreen() + c.getBlue();
         if(sum < actualDarkestSum) {
            actualDarkestSum = sum;
            actualDarkestId = (byte) i;
         }
      }
      Color darkest = palette.getDarkestColor();
      Assertions.assertEquals(actualDarkestSum, darkest.getRed() + darkest.getGreen() + darkest.getBlue());
      Assertions.assertEquals(actualDarkestId, palette.getDarkestColorIndex());
      int actualBrightestSum = 0;
      byte actualBrightestId = 0;
      for (int i = palette.numShades(); i < palette.length(); i++) {
         Color c = palette.getColorAt((byte) i);
         int sum = c.getRed() + c.getGreen() + c.getBlue();
         if(sum > actualBrightestSum) {
            actualBrightestSum = sum;
            actualBrightestId = (byte) i;
         }
      }
      Color brightest = palette.getBrightestColor();
      Assertions.assertEquals(actualBrightestSum, brightest.getRed() + brightest.getGreen() + brightest.getBlue());
      Assertions.assertEquals(actualBrightestId, palette.getBrightestColorIndex());
   }

   @Test
   public void palette1_12Test() {
      Palette palette = Palette.PALETTE_1_12;
      Assertions.assertEquals(4, palette.numShades());
      Assertions.assertArrayEquals(new float[] { 0.71f, 0.86f, 1.f, 0.53f }, palette.getMultiplierFloats());
      Assertions.assertArrayEquals(new int[] { 180, 220, 255, 135 }, palette.getMultipliers());
      int actualDarkestSum = 255 * 3;
      byte actualDarkestId = 0;
      for (int i = palette.numShades(); i < palette.length(); i++) {
         Color c = palette.getColorAt((byte) i);
         int sum = c.getRed() + c.getGreen() + c.getBlue();
         if(sum < actualDarkestSum) {
            actualDarkestSum = sum;
            actualDarkestId = (byte) i;
         }
      }
      Color darkest = palette.getDarkestColor();
      Assertions.assertEquals(actualDarkestSum, darkest.getRed() + darkest.getGreen() + darkest.getBlue());
      Assertions.assertEquals(actualDarkestId, palette.getDarkestColorIndex());
      int actualBrightestSum = 0;
      byte actualBrightestId = 0;
      for (int i = palette.numShades(); i < palette.length(); i++) {
         Color c = palette.getColorAt((byte) i);
         int sum = c.getRed() + c.getGreen() + c.getBlue();
         if(sum > actualBrightestSum) {
            actualBrightestSum = sum;
            actualBrightestId = (byte) i;
         }
      }
      Color brightest = palette.getBrightestColor();
      Assertions.assertEquals(actualBrightestSum, brightest.getRed() + brightest.getGreen() + brightest.getBlue());
      Assertions.assertEquals(actualBrightestId, palette.getBrightestColorIndex());
   }

   @Test
   public void palette1_8Test() {
      Palette palette = Palette.PALETTE_1_8_1;
      Assertions.assertEquals(4, palette.numShades());
      Assertions.assertArrayEquals(new float[] { 0.71f, 0.86f, 1.f, 0.53f }, palette.getMultiplierFloats());
      Assertions.assertArrayEquals(new int[] { 180, 220, 255, 135 }, palette.getMultipliers());
      int actualDarkestSum = 255 * 3;
      byte actualDarkestId = 0;
      for (int i = palette.numShades(); i < palette.length(); i++) {
         Color c = palette.getColorAt((byte) i);
         int sum = c.getRed() + c.getGreen() + c.getBlue();
         if(sum < actualDarkestSum) {
            actualDarkestSum = sum;
            actualDarkestId = (byte) i;
         }
      }
      Color darkest = palette.getDarkestColor();
      Assertions.assertEquals(actualDarkestSum, darkest.getRed() + darkest.getGreen() + darkest.getBlue());
      Assertions.assertEquals(actualDarkestId, palette.getDarkestColorIndex());
      int actualBrightestSum = 0;
      byte actualBrightestId = 0;
      for (int i = palette.numShades(); i < palette.length(); i++) {
         Color c = palette.getColorAt((byte) i);
         int sum = c.getRed() + c.getGreen() + c.getBlue();
         if(sum > actualBrightestSum) {
            actualBrightestSum = sum;
            actualBrightestId = (byte) i;
         }
      }
      Color brightest = palette.getBrightestColor();
      Assertions.assertEquals(actualBrightestSum, brightest.getRed() + brightest.getGreen() + brightest.getBlue());
      Assertions.assertEquals(actualBrightestId, palette.getBrightestColorIndex());
   }

   @Test
   public void palette1_7Test() {
      Palette palette = Palette.PALETTE_1_7_2;
      Assertions.assertEquals(4, palette.numShades());
      Assertions.assertArrayEquals(new float[] { 0.71f, 0.86f, 1.f, 0.86f }, palette.getMultiplierFloats());
      Assertions.assertArrayEquals(new int[] { 180, 220, 255, 220 }, palette.getMultipliers());
      int actualDarkestSum = 255 * 3;
      byte actualDarkestId = 0;
      for (int i = palette.numShades(); i < palette.length(); i++) {
         Color c = palette.getColorAt((byte) i);
         int sum = c.getRed() + c.getGreen() + c.getBlue();
         if(sum < actualDarkestSum) {
            actualDarkestSum = sum;
            actualDarkestId = (byte) i;
         }
      }
      Color darkest = palette.getDarkestColor();
      Assertions.assertEquals(actualDarkestSum, darkest.getRed() + darkest.getGreen() + darkest.getBlue());
      Assertions.assertEquals(actualDarkestId, palette.getDarkestColorIndex());
      int actualBrightestSum = 0;
      byte actualBrightestId = 0;
      for (int i = palette.numShades(); i < palette.length(); i++) {
         Color c = palette.getColorAt((byte) i);
         int sum = c.getRed() + c.getGreen() + c.getBlue();
         if(sum > actualBrightestSum) {
            actualBrightestSum = sum;
            actualBrightestId = (byte) i;
         }
      }
      Color brightest = palette.getBrightestColor();
      Assertions.assertEquals(actualBrightestSum, brightest.getRed() + brightest.getGreen() + brightest.getBlue());
      Assertions.assertEquals(actualBrightestId, palette.getBrightestColorIndex());
   }

   @Test
   public void originalPaletteTest() {
      Palette palette = Palette.ORIGINAL_PALETTE;
      Assertions.assertEquals(3, palette.numShades());
      Assertions.assertArrayEquals(new float[] { 0.71f, 0.86f, 1.f }, palette.getMultiplierFloats());
      Assertions.assertArrayEquals(new int[] { 180, 220, 255 }, palette.getMultipliers());
      int actualDarkestSum = 255 * 3;
      byte actualDarkestId = 0;
      for (int i = palette.numShades(); i < palette.length(); i++) {
         Color c = palette.getColorAt((byte) i);
         int sum = c.getRed() + c.getGreen() + c.getBlue();
         if(sum < actualDarkestSum) {
            actualDarkestSum = sum;
            actualDarkestId = (byte) i;
         }
      }
      Color darkest = palette.getDarkestColor();
      Assertions.assertEquals(actualDarkestSum, darkest.getRed() + darkest.getGreen() + darkest.getBlue());
      Assertions.assertEquals(actualDarkestId, palette.getDarkestColorIndex());
      int actualBrightestSum = 0;
      byte actualBrightestId = 0;
      for (int i = palette.numShades(); i < palette.length(); i++) {
         Color c = palette.getColorAt((byte) i);
         int sum = c.getRed() + c.getGreen() + c.getBlue();
         if(sum > actualBrightestSum) {
            actualBrightestSum = sum;
            actualBrightestId = (byte) i;
         }
      }
      Color brightest = palette.getBrightestColor();
      Assertions.assertEquals(actualBrightestSum, brightest.getRed() + brightest.getGreen() + brightest.getBlue());
      Assertions.assertEquals(actualBrightestId, palette.getBrightestColorIndex());
      Color[] reshaded = Palette.shadeColors(palette.baseColors(), palette.getMultipliers());
      Assertions.assertArrayEquals(palette.getColors(), reshaded);
   }

}
