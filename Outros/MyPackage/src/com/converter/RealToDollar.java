// Meu pacote
package com.converter;

public class RealToDollar {
  public static String convertRealToDollar(double value) {
    return String.format("$ %.2f", (value * 5.14));
  }
}
