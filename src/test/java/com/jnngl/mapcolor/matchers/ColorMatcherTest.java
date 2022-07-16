package com.jnngl.mapcolor.matchers;

import com.jnngl.mapcolor.ColorMatcher;
import com.jnngl.mapcolor.palette.Palette;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

class ColorMatcherTest {

   public static final int DEFAULT_COLOR_MATCHER_RUNS = 25;
   public static final int DEFAULT_COLOR_MATCHER_TIMES = 25;

   public static final int DEFAULT_CACHED_MATCHER_RUNS = 50;
   public static final int DEFAULT_CACHED_MATCHER_TIMES = 1000;

   public static final int BUFFERED_IMAGE_MATCHER_RUNS = 50;
   public static final int BUFFERED_IMAGE_MATCHER_TIMES = 1000;

   @Test
   public void defaultColorMatcherTest() throws IOException {
      System.out.println("Default color matcher test (" + DEFAULT_COLOR_MATCHER_TIMES + " images, " + DEFAULT_COLOR_MATCHER_RUNS + " runs):");

      InputStream inputStream = ColorMatcherTest.class.getResourceAsStream("/testImage.png");
      Assertions.assertNotNull(inputStream);
      BufferedImage original = ImageIO.read(inputStream);
      int[] source = original.getRGB(0, 0, original.getWidth(), original.getHeight(), null, 0, original.getWidth());

      byte[] dst = new byte[original.getWidth() * original.getHeight()];

      for (Palette palette : Palette.ALL_PALETTES) {
         ColorMatcher matcher = new DefaultColorMatcher(palette);

         long avg, min, max;

         avg = max = 0;
         min = Long.MAX_VALUE;
         for (int i = 0; i < DEFAULT_COLOR_MATCHER_RUNS; i++) {
            long current = System.currentTimeMillis();
            for (int j = 0; j < DEFAULT_COLOR_MATCHER_TIMES; j++) {
               matcher.matchImage(source, original.getWidth(), original.getHeight(), dst);
            }
            long tookTime = System.currentTimeMillis() - current;
            avg += tookTime;
            if (tookTime > max) {
               max = tookTime;
            }
            if (min > tookTime) {
               min = tookTime;
            }
         }
         avg /= DEFAULT_COLOR_MATCHER_RUNS;
         System.out.println(palette.getClass().getSimpleName() + ": avg: " + avg + "ms, min: " + min + "ms, max: " + max);

         ImageIO.write(matcher.toBufferedImage(dst, original.getWidth(), original.getHeight()), "PNG",
                 new File("build/test-results/default_matcher_output_" + palette.getClass().getSimpleName() + ".png"));
      }
      System.out.println();
   }

   @Test
   public void cachedColorMatcherTest() throws IOException {
      System.out.println("Cached color matcher test (" + DEFAULT_CACHED_MATCHER_TIMES + " images, " + DEFAULT_CACHED_MATCHER_RUNS + " runs):");

      InputStream inputStream = ColorMatcherTest.class.getResourceAsStream("/testImage.png");
      Assertions.assertNotNull(inputStream);
      BufferedImage original = ImageIO.read(inputStream);
      int[] source = original.getRGB(0, 0, original.getWidth(), original.getHeight(), null, 0, original.getWidth());

      byte[] dst = new byte[original.getWidth() * original.getHeight()];

      for (Palette palette : Palette.ALL_PALETTES) {
         ColorMatcher matcher = new CachedColorMatcher(palette);

         long avg, min, max;

         avg = max = 0;
         min = Long.MAX_VALUE;
         for (int i = 0; i < DEFAULT_CACHED_MATCHER_RUNS; i++) {
            long current = System.currentTimeMillis();
            for (int j = 0; j < DEFAULT_CACHED_MATCHER_TIMES; j++) {
               matcher.matchImage(source, original.getWidth(), original.getHeight(), dst);
            }
            long tookTime = System.currentTimeMillis() - current;
            avg += tookTime;
            if (tookTime > max) {
               max = tookTime;
            }
            if (min > tookTime) {
               min = tookTime;
            }
         }
         avg /= DEFAULT_CACHED_MATCHER_RUNS;
         System.out.println(palette.getClass().getSimpleName() + ": avg: " + avg + "ms, min: " + min + "ms, max: " + max);

         ImageIO.write(matcher.toBufferedImage(dst, original.getWidth(), original.getHeight()), "PNG",
                 new File("build/test-results/cached_matcher_output_" + palette.getClass().getSimpleName() + ".png"));
      }
      System.out.println();
   }

   @Test
   public void bufferedImageColorMatcherTest() throws IOException {
      System.out.println("Buffered image color matcher test (" + BUFFERED_IMAGE_MATCHER_TIMES + " images, " + BUFFERED_IMAGE_MATCHER_RUNS + " runs):");

      InputStream inputStream = ColorMatcherTest.class.getResourceAsStream("/testImage.png");
      Assertions.assertNotNull(inputStream);
      BufferedImage source = ImageIO.read(inputStream); // This matcher should be normally used with buffered images

      byte[] dst = new byte[source.getWidth() * source.getHeight()];

      for (Palette palette : Palette.ALL_PALETTES) {
         ColorMatcher matcher = new BufferedImageMatcher(palette);

         long avg, min, max;

         avg = max = 0;
         min = Long.MAX_VALUE;
         for (int i = 0; i < BUFFERED_IMAGE_MATCHER_RUNS; i++) {
            long current = System.currentTimeMillis();
            for (int j = 0; j < BUFFERED_IMAGE_MATCHER_TIMES; j++) {
               matcher.matchImage(source, dst);
            }
            long tookTime = System.currentTimeMillis() - current;
            avg += tookTime;
            if (tookTime > max) {
               max = tookTime;
            }
            if (min > tookTime) {
               min = tookTime;
            }
         }
         avg /= BUFFERED_IMAGE_MATCHER_RUNS;
         System.out.println(palette.getClass().getSimpleName() + ": avg: " + avg + "ms, min: " + min + "ms, max: " + max);

         ImageIO.write(matcher.toBufferedImage(dst, source.getWidth(), source.getHeight()), "PNG",
                 new File("build/test-results/buffered_image_mather_output_" + palette.getClass().getSimpleName() + ".png"));
      }
      System.out.println();
   }


}
