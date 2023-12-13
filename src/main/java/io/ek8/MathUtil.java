package io.ek8;

public class MathUtil {
  public int add(int x, int y) {
    return x + y;
  }

  public int subtract(int x, int y) {
    return x - y;
  }

  public int divide(int x, int y) throws Exception {
    if (x == 0 || y == 0) {
      throw new Exception("can't use zeros");
    }
    return x / y;
  }

  public boolean isEven(int number) {
    return number % 2 == 0;
  }
}
