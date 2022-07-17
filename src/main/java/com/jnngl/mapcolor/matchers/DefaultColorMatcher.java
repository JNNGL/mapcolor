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

package com.jnngl.mapcolor.matchers;

import com.jnngl.mapcolor.ColorMatcher;
import com.jnngl.mapcolor.palette.Palette;

import java.awt.*;

public class DefaultColorMatcher extends ColorMatcher {

   public DefaultColorMatcher(Palette palette) {
      super(palette);
   }

   private double getDistance(Color c1, Color c2) {
      double rMean = (double)(c1.getRed() + c2.getRed()) / 2.0D;
      double r = c1.getRed() - c2.getRed();
      double g = c1.getGreen() - c2.getGreen();
      int b = c1.getBlue() - c2.getBlue();
      double weightR = 2.0D + rMean / 256.0D;
      double weightG = 4.0D;
      double weightB = 2.0D + (255.0D - rMean) / 256.0D;
      return weightR * r * r + weightG * g * g + weightB * (double)b * (double)b;
   }

   @Override
   public byte matchColor(Color color) {
      if (color.getAlpha() < 128) {
         return 0;
      } else {
         int index = 0;
         double best = -1.0D;

         for(int i = palette.numShades(); i < palette.length(); ++i) {
            double distance = getDistance(color, palette.getColorAt((byte) i));
            if (distance < best || best == -1.0D) {
               best = distance;
               index = i;
            }
         }

         return (byte)(index < 128 ? index : -129 + (index - 127));
      }
   }

   @Override
   public ColorMatcher copy() {
      return new DefaultColorMatcher(this.palette);
   }
}
