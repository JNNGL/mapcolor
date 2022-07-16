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

public class Palette116 implements Palette {

   public static final byte DARKEST = (byte) 207;
   public static final byte BRIGHTEST = 34;

   private static final Color[] palette;
   private static final int[] intPalette;

   protected Palette116() {}

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
              new Color(140, 140, 140), // Base 3
              new Color(171, 171, 171),
              new Color(199, 199, 199),
              new Color(105, 105, 105),
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
              new Color(106, 76, 54), // Base 10
              new Color(130, 94, 66),
              new Color(151, 109, 77),
              new Color(79, 57, 40),
              new Color(79, 79, 79), // Base 11
              new Color(96, 96, 96),
              new Color(112, 112, 112),
              new Color(59, 59, 59),
              new Color(45, 45, 180), // Base 12
              new Color(55, 55, 220),
              new Color(64, 64, 255),
              new Color(33, 33, 135),
              new Color(100, 84, 50), // Base 13
              new Color(123, 102, 62),
              new Color(143, 119, 72),
              new Color(75, 63, 38),
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
              new Color(91, 60, 34), // Base 34
              new Color(111, 74, 42),
              new Color(129, 86, 49),
              new Color(68, 45, 25),
              new Color(79, 1, 0), // Base 35
              new Color(96, 1, 0),
              new Color(112, 2, 0),
              new Color(59, 1, 0),
              new Color(147, 124, 113), // Base 36
              new Color(180, 152, 138),
              new Color(209, 177, 161),
              new Color(110, 93, 85),
              new Color(112, 57, 25), // Base 37
              new Color(137, 70, 31),
              new Color(159, 82, 36),
              new Color(84, 43, 19),
              new Color(105, 61, 76), // Base 38
              new Color(128, 75, 93),
              new Color(149, 87, 108),
              new Color(78, 46, 57),
              new Color(79, 76, 97), // Base 39
              new Color(96, 93, 119),
              new Color(112, 108, 138),
              new Color(59, 57, 73),
              new Color(131, 93, 25), // Base 40
              new Color(160, 114, 31),
              new Color(186, 133, 36),
              new Color(98, 70, 19),
              new Color(72, 82, 37), // Base 41
              new Color(88, 100, 45),
              new Color(103, 117, 53),
              new Color(54, 61, 28),
              new Color(112, 54, 55), // Base 42
              new Color(138, 66, 67),
              new Color(160, 77, 78),
              new Color(84, 40, 41),
              new Color(40, 28, 24), // Base 43
              new Color(49, 35, 30),
              new Color(57, 41, 35),
              new Color(30, 21, 18),
              new Color(95, 75, 69), // Base 44
              new Color(116, 92, 84),
              new Color(135, 107, 98),
              new Color(71, 56, 51),
              new Color(61, 64, 64), // Base 45
              new Color(75, 79, 79),
              new Color(87, 92, 92),
              new Color(46, 48, 48),
              new Color(86, 51, 62), // Base 46
              new Color(105, 62, 75),
              new Color(122, 73, 88),
              new Color(64, 38, 46),
              new Color(53, 43, 64), // Base 47
              new Color(65, 53, 79),
              new Color(76, 62, 92),
              new Color(40, 32, 48),
              new Color(53, 35, 24), // Base 48
              new Color(65, 43, 30),
              new Color(76, 50, 35),
              new Color(40, 26, 18),
              new Color(53, 57, 29), // Base 49
              new Color(65, 70, 36),
              new Color(76, 82, 42),
              new Color(40, 43, 22),
              new Color(100, 42, 32), // Base 50
              new Color(122, 51, 39),
              new Color(142, 60, 46),
              new Color(75, 31, 24),
              new Color(26, 15, 11), // Base 51
              new Color(31, 18, 13),
              new Color(37, 22, 16),
              new Color(19, 11, 8),
              new Color(133, 33, 34), // Base 52
              new Color(163, 41, 42),
              new Color(189, 48, 49),
              new Color(100, 25, 25),
              new Color(104, 44, 68), // Base 53
              new Color(127, 54, 83),
              new Color(148, 63, 97),
              new Color(78, 33, 51),
              new Color(64, 17, 20), // Base 54
              new Color(79, 21, 25),
              new Color(92, 25, 29),
              new Color(48, 13, 15),
              new Color(15, 88, 94), // Base 55
              new Color(18, 108, 115),
              new Color(22, 126, 134),
              new Color(11, 66, 70),
              new Color(40, 100, 98), // Base 56
              new Color(50, 122, 120),
              new Color(58, 142, 140),
              new Color(30, 75, 74),
              new Color(60, 31, 43), // Base 57
              new Color(74, 37, 53),
              new Color(86, 44, 62),
              new Color(45, 23, 32),
              new Color(14, 127, 93), // Base 58
              new Color(17, 155, 114),
              new Color(20, 180, 133),
              new Color(10, 95, 70),
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
   public static final byte TERRACOTTA_WHITE_ID = 36;
   public static final byte TERRACOTTA_ORANGE_ID = 37;
   public static final byte TERRACOTTA_MAGENTA_ID = 38;
   public static final byte TERRACOTTA_LIGHT_BLUE_ID = 39;
   public static final byte TERRACOTTA_YELLOW_ID = 40;
   public static final byte TERRACOTTA_LIGHT_GREEN_ID = 41;
   public static final byte TERRACOTTA_PINK_ID = 42;
   public static final byte TERRACOTTA_GRAY_ID = 43;
   public static final byte TERRACOTTA_LIGHT_GRAY_ID = 44;
   public static final byte TERRACOTTA_CYAN_ID = 45;
   public static final byte TERRACOTTA_PURPLE_ID = 46;
   public static final byte TERRACOTTA_BLUE_ID = 47;
   public static final byte TERRACOTTA_BROWN_ID = 48;
   public static final byte TERRACOTTA_GREEN_ID = 49;
   public static final byte TERRACOTTA_RED_ID = 50;
   public static final byte TERRACOTTA_BLACK_ID = 51;
   public static final byte CRIMSON_NYLIUM_ID = 52;
   public static final byte CRIMSON_STEM_ID = 53;
   public static final byte CRIMSON_HYPHAE_ID = 54;
   public static final byte WARPED_NYLIUM_ID = 55;
   public static final byte WARPED_STEM_ID = 56;
   public static final byte WARPED_HYPHAE_ID = 57;
   public static final byte WARPED_WART_BLOCK_ID = 58;

}
