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
