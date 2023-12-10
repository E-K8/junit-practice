package io.ek8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

  @Test
  void add() {
//    given
    int x = 2, y = 1;
//    when
    MathUtil mathUtil = new MathUtil();
    int actual = mathUtil.add(x, y);
//    then
    assertEquals(3, actual);
  }

  @Test
  void subtract() {
    //    given
    int x = 11, y = 2;
//    when
    MathUtil mathUtil = new MathUtil();
    int actual = mathUtil.subtract(x, y);
//    then
    assertEquals(9, actual);
  }
}