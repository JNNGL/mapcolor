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

package com.jnngl.mapcolor;

import com.jnngl.mapcolor.palette.Palette;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public abstract class ColorMatcher {

   protected Palette palette;

   public ColorMatcher(Palette palette) {
      this.setPalette(palette);
   }

   public Palette getPalette() {
      return palette;
   }

   public void setPalette(Palette palette) {
      this.palette = palette;
   }

   public abstract byte matchColor(Color color);
   public abstract ColorMatcher copy();

   public byte matchColor(int rgb) {
      return this.matchColor(new Color(rgb));
   }

   public byte[] matchImage(int[] rgb, int width, int height, byte[] dst) {
      for (int i = 0; i < dst.length; i++) {
         dst[i] = this.matchColor(rgb[i]);
      }
      return dst;
   }

   public byte[] matchImage(BufferedImage image, byte[] dst) {
      int[] rgb = image.getRGB(0, 0, image.getWidth(), image.getHeight(), null, 0, image.getWidth());
      return this.matchImage(rgb, image.getWidth(), image.getHeight(), dst);
   }

   public byte[] matchImage(int[] rgb, int width, int height) {
      return this.matchImage(rgb, width, height, new byte[width * height]);
   }

   public byte[] matchImage(BufferedImage image) {
      return this.matchImage(image, new byte[image.getWidth() * image.getHeight()]);
   }

   public BufferedImage toBufferedImage(byte[] bytes, int width, int height) {
      BufferedImage dst = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
      for (int y = 0; y < height; y++) {
         int base = y * width;
         for (int x = 0; x < width; x++) {
            dst.setRGB(x, y, this.palette.getColorAt(bytes[base + x]).getRGB());
         }
      }
      return dst;
   }

}