package com.jnngl.mapcolor;

public final class ColorMatchers {

   public static ThreadLocal<ColorMatcher> makeThreadLocal(ColorMatcher matcher) {
      return ThreadLocal.withInitial(matcher::copy);
   }

}
