package io.ek8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MathUtil {
  public int add(int x, int y) {
    return x + y;
  }

  public int subtract(int x, int y) {
    return x - y;
  }

  public Integer divide(int x, int y) throws Exception {
    if (y == 0) {
      throw new Exception("can't use zeros");
    } else if (x == 0) {
      return null;
    }
    return x / y;
  }

  public boolean isEven(int number) {
    return number % 2 == 0;
  }

  public int generateRandom(int limit) throws InterruptedException {
    Thread.sleep(500);
    return new Random().nextInt(limit);
  }

  public int[] duplicateArr(Integer[] numbers) {
    return Arrays.stream(numbers).mapToInt(e -> e * 2).toArray();
  }

  public List<Integer> duplicateList(List<Integer> numbers) {
    return numbers.stream().map(e -> e * 2).toList();
  }
}
