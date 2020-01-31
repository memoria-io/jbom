package com.marmoush.jbom;

public class Jdk13Preview {
  private Jdk13Preview() {}

  public static int switchJdk13(String mode) {
    return switch (mode) {
      case "a", "b" -> 1;
      case "c" -> 2;
      case "d", "e", "f" -> 3;
      default -> -1;
    };
  }
}
