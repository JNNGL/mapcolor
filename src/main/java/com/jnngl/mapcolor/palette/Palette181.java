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

public class Palette181 implements Palette {

   public static final byte DARKEST = 119;
   public static final byte BRIGHTEST = 34;

   public static final Color[] palette;
   public static final int[] intPalette;

   protected Palette181() {}

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

   static {
      palette = new Color[] {
              new Color(0, 0, 0, 0), // Base 0
              new Color(0, 0, 0, 0),
              new Color(0, 0, 0, 0),
              new Color(0, 0, 0, 0),
              new Color(89, 125, 39), // Base 1
              new Color(109, 153, 48),
              new Color(127, 178, 56),
              new Color(67, 94, 29),
              new Color(174, 164, 115), // Base 2
              new Color(213, 201, 140),
              new Color(247, 233, 163),
              new Color(130, 123, 86),
              new Color(138, 138, 138), // Base 3
              new Color(169, 169, 169),
              new Color(197, 197, 197),
              new Color(104, 104, 104),
              new Color(180, 0, 0), // Base 4
              new Color(220, 0, 0),
              new Color(255, 0, 0),
              new Color(135, 0, 0),
              new Color(112, 112, 180), // Base 5
              new Color(138, 138, 220),
              new Color(160, 160, 255),
              new Color(84, 84, 135),
              new Color(117, 117, 117), // Base 6
              new Color(144, 144, 144),
              new Color(167, 167, 167),
              new Color(88, 88, 88),
              new Color(0, 87, 0), // Base 7
              new Color(0, 106, 0),
              new Color(0, 124, 0),
              new Color(0, 65, 0),
              new Color(180, 180, 180), // Base 8
              new Color(220, 220, 220),
              new Color(255, 255, 255),
              new Color(135, 135, 135),
              new Color(115, 118, 129), // Base 9
              new Color(141, 144, 158),
              new Color(164, 168, 184),
              new Color(86, 88, 97),
              new Color(129, 74, 33), // Base 10
              new Color(157, 91, 40),
              new Color(183, 106, 47),
              new Color(96, 56, 24),
              new Color(79, 79, 79), // Base 11
              new Color(96, 96, 96),
              new Color(112, 112, 112),
              new Color(59, 59, 59),
              new Color(101, 84, 51), // Base 12
              new Color(123, 103, 62),
              new Color(143, 119, 72),
              new Color(76, 63, 38),
              new Color(45, 45, 180), // Base 13
              new Color(55, 55, 220),
              new Color(64, 64, 255),
              new Color(33, 33, 135),
              new Color(180, 177, 172), // Base 14
              new Color(220, 217, 211),
              new Color(255, 252, 245),
              new Color(135, 133, 129),
              new Color(152, 89, 36), // Base 15
              new Color(186, 109, 44),
              new Color(216, 127, 51),
              new Color(114, 67, 27),
              new Color(125, 53, 152), // Base 16
              new Color(153, 65, 186),
              new Color(178, 76, 216),
              new Color(94, 40, 114),
              new Color(72, 108, 152), // Base 17
              new Color(88, 132, 186),
              new Color(102, 153, 216),
              new Color(54, 81, 114),
              new Color(161, 161, 36), // Base 18
              new Color(197, 197, 44),
              new Color(229, 229, 51),
              new Color(121, 121, 27),
              new Color(89, 144, 17), // Base 19
              new Color(109, 176, 21),
              new Color(127, 204, 25),
              new Color(67, 108, 13),
              new Color(170, 89, 116), // Base 20
              new Color(208, 109, 142),
              new Color(242, 127, 165),
              new Color(128, 67, 87),
              new Color(53, 53, 53), // Base 21
              new Color(65, 65, 65),
              new Color(76, 76, 76),
              new Color(40, 40, 40),
              new Color(108, 108, 108), // Base 22
              new Color(132, 132, 132),
              new Color(153, 153, 153),
              new Color(81, 81, 81),
              new Color(53, 89, 108), // Base 23
              new Color(65, 109, 132),
              new Color(76, 127, 153),
              new Color(40, 67, 81),
              new Color(89, 44, 125), // Base 24
              new Color(109, 54, 153),
              new Color(127, 63, 178),
              new Color(67, 33, 94),
              new Color(36, 53, 125), // Base 25
              new Color(44, 65, 153),
              new Color(51, 76, 178),
              new Color(27, 40, 94),
              new Color(72, 53, 36), // Base 26
              new Color(88, 65, 44),
              new Color(102, 76, 51),
              new Color(54, 40, 27),
              new Color(72, 89, 36), // Base 27
              new Color(88, 109, 44),
              new Color(102, 127, 51),
              new Color(54, 67, 27),
              new Color(108, 36, 36), // Base 28
              new Color(132, 44, 44),
              new Color(153, 51, 51),
              new Color(81, 27, 27),
              new Color(17, 17, 17), // Base 29
              new Color(21, 21, 21),
              new Color(25, 25, 25),
              new Color(13, 13, 13),
              new Color(176, 168, 54), // Base 30
              new Color(215, 205, 66),
              new Color(250, 238, 77),
              new Color(132, 126, 40),
              new Color(64, 154, 150), // Base 31
              new Color(79, 188, 183),
              new Color(92, 219, 213),
              new Color(48, 115, 112),
              new Color(52, 90, 180), // Base 32
              new Color(63, 110, 220),
              new Color(74, 128, 255),
              new Color(39, 67, 135),
              new Color(0, 153, 40), // Base 33
              new Color(0, 187, 50),
              new Color(0, 217, 58),
              new Color(0, 114, 30),
              new Color(90, 59, 34), // Base 34
              new Color(110, 73, 41),
              new Color(127, 85, 48),
              new Color(67, 44, 25),
              new Color(79, 1, 0), // Base 35
              new Color(96, 1, 0),
              new Color(112, 2, 0),
              new Color(59, 1, 0),
      };
      
      intPalette = Palette.getColorsRGB(palette);
   }

   public static final byte TRANSPARENT_ID = 0;
   public static final byte GRASS_ID = 1;
   public static final byte SAND_ID = 2;
   public static final byte WOOL_ID = 3;
   public static final byte FIRE_ID = 4;
   public static final byte ICE_ID = 5;
   public static final byte METAL_ID = 6;
   public static final byte PLANT_ID = 7;
   public static final byte SNOW_ID = 8;
   public static final byte CLAY_ID = 9;
   public static final byte DIRT_ID = 10;
   public static final byte STONE_ID = 11;
   public static final byte WATER_ID = 12;
   public static final byte WOOD_ID = 13;
   public static final byte QUARTZ_ID = 14;
   public static final byte COLOR_ORANGE_ID = 15;
   public static final byte COLOR_MAGENTA_ID = 16;
   public static final byte COLOR_LIGHT_BLUE_ID = 17;
   public static final byte COLOR_YELLOW_ID = 18;
   public static final byte COLOR_LIGHT_GREEN_ID = 19;
   public static final byte COLOR_PINK_ID = 20;
   public static final byte COLOR_GRAY_ID = 21;
   public static final byte COLOR_LIGHT_GRAY_ID = 22;
   public static final byte COLOR_CYAN_ID = 23;
   public static final byte COLOR_PURPLE_ID = 24;
   public static final byte COLOR_BLUE_ID = 25;
   public static final byte COLOR_BROWN_ID = 26;
   public static final byte COLOR_GREEN_ID = 27;
   public static final byte COLOR_RED_ID = 28;
   public static final byte COLOR_BLACK_ID = 29;
   public static final byte GOLD_ID = 30;
   public static final byte DIAMOND_ID = 31;
   public static final byte LAPIS_ID = 32;
   public static final byte EMERALD_ID = 33;
   public static final byte PODZOL_ID = 34;
   public static final byte NETHER_ID = 35;

}
