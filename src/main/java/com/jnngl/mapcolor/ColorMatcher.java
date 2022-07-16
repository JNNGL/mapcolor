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
      int[] rgb = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();
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