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
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.IndexColorModel;
import java.util.HashMap;
import java.util.Map;

public class BufferedImageMatcher extends ColorMatcher {

   public static final int DEFAULT_BUFFER_WIDTH = 128;
   public static final int DEFAULT_BUFFER_HEIGHT = 128;

   private IndexColorModel colorModel;
   private BufferedImage buffer;
   private Graphics2D graphics;
   private Map<?, ?> properties;

   public BufferedImageMatcher(Palette palette, int width, int height) {
      super(palette);
      this.createBuffer(width, height);
   }

   public BufferedImageMatcher(Palette palette) {
      this(palette, DEFAULT_BUFFER_WIDTH, DEFAULT_BUFFER_HEIGHT);
   }

   public void createBuffer(int width, int height) {
      if (this.graphics != null) {
         this.graphics.dispose();
      }
      this.buffer = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_INDEXED, this.colorModel);
      this.graphics = this.buffer.createGraphics();
      if (this.properties != null) {
         this.graphics.setRenderingHints(this.properties);
      }
   }

   @Override
   public void setPalette(Palette palette) {
      super.setPalette(palette);
      this.colorModel = new IndexColorModel(8, palette.length() - palette.numShades(), palette.getIntColors(),
              palette.numShades(), false, 0, DataBuffer.TYPE_BYTE);
      if (this.buffer != null) { // Buffer should be recreated
         this.createBuffer(buffer.getWidth(), buffer.getHeight());
      }
   }

   public void setProperties(Map<?, ?> properties) {
      this.properties = properties;
      if (this.graphics != null) {
         if (this.properties != null) {
            this.graphics.setRenderingHints(this.properties);
         } else {
            this.graphics.setRenderingHints(new HashMap<>());
         }
      }
   }

   public Map<?, ?> getProperties() {
      return properties;
   }

   @Override
   public byte matchColor(Color color) {
      this.graphics.setColor(color);
      this.graphics.fillRect(0, 0, 1, 1);
      byte index = ((DataBufferByte) buffer.getRaster().getDataBuffer()).getData()[0];
      return this.fixTransparentColor(index);
   }

   @Override
   public byte[] matchImage(BufferedImage image, byte[] dst) {
      this.recreateBufferIfNeeded(image.getWidth(), image.getHeight());
      this.graphics.drawImage(image, 0, 0, null);
      return this.getBufferBytes(dst);
   }

   @Override
   public byte[] matchImage(int[] rgb, int width, int height, byte[] dst) {
      this.recreateBufferIfNeeded(width, height);
      this.buffer.setRGB(0, 0, width, height, rgb, 0, width);
      return this.getBufferBytes(dst);
   }

   private void recreateBufferIfNeeded(int width, int height) {
      if (this.buffer.getWidth() != width
            || this.buffer.getHeight() != height) {
         this.createBuffer(width, height);
      }
   }

   public byte[] getBufferBytes(byte[] dst) {
      System.arraycopy(((DataBufferByte) this.buffer.getRaster().getDataBuffer()).getData(), 0, dst, 0, dst.length);
      for (int i = 0; i < dst.length; i++) {
         dst[i] += 4;
      }
      return dst;
   }

   private byte fixTransparentColor(byte index) {
      if (index < this.palette.numShades()) {
         return this.palette.getDarkestColorIndex();
      }
      return index;
   }

   @Override
   public ColorMatcher copy() {
      BufferedImageMatcher matcher =
              new BufferedImageMatcher(this.palette, this.buffer.getWidth(), this.buffer.getHeight());
      if (this.properties != null) {
         matcher.setProperties(this.properties);
      }
      return matcher;
   }
}
