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

public class CachedColorMatcher extends ColorMatcher {

   private int[] cache;
   private ColorMatcher base;

   public CachedColorMatcher(Palette palette, ColorMatcher base) {
      super(palette);
      this.base = base;
      this.cacheColors();
   }

   public CachedColorMatcher(Palette palette) {
      this(palette, new DefaultColorMatcher(palette));
   }

   public ColorMatcher getBaseMatcher() {
      return base;
   }

   public void setBaseMatcher(ColorMatcher base) {
      this.base = base;
   }

   @Override
   public void setPalette(Palette palette) {
      super.setPalette(palette);
   }

   private void cacheColors() {
      if (this.base != null) {
         cache = new int[0x1000];
         for (int i = 0x000; i <= 0xFFF; i++) {
            cache[i] = base.matchColor(new Color((i & 0xF00) >> 4, i & 0xF0, (i & 0xF) << 4));
         }
      }
   }

   @Override
   public byte matchColor(Color color) {
      int rgb = color.getRGB();
      return (byte) cache[(rgb & 0xF00000) >> 12 | (rgb & 0xF000) >> 8 | (rgb & 0xF0) >> 4];
   }

   @Override
   public ColorMatcher copy() {
      return new CachedColorMatcher(this.palette, this.base);
   }
}
