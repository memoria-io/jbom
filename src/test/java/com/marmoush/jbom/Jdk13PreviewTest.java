package com.marmoush.jbom;

import org.junit.jupiter.api.*;

import static com.marmoush.jbom.Jdk13Preview.switchJdk13;

public class Jdk13PreviewTest {
  @Test
  void switchTest() {
    Assertions.assertEquals(1, switchJdk13("a"));
    Assertions.assertEquals(2, switchJdk13("c"));
    Assertions.assertEquals(-1, switchJdk13("z"));
  }
}
