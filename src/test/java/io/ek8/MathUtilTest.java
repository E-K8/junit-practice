package io.ek8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

  @Test
  @DisplayName("should Return Three When Adding Two And One")
  void shouldReturnThreeWhenAddingTwoAndOne() {
//    given
    int x = 2, y = 1;
//    when
    MathUtil mathUtil = new MathUtil();
    int actual = mathUtil.add(x, y);
//    then
    assertEquals(3, actual);
  }

  @Test
  @DisplayName("should Return Nine When Subtracting Eleven Minus Two")
  void shouldReturnNineWhenSubtractingElevenMinusTwo() {
    //    given
    int x = 11, y = 2;
//    when
    MathUtil mathUtil = new MathUtil();
    int actual = mathUtil.subtract(x, y);
//    then
    assertEquals(9, actual);
  }

  @Test
  @DisplayName("should Return Three When Dividing Fifteen By Five")
  void shouldReturnThreeWhenDividingFifteenByFive() {
    int x = 15, y = 5;
    MathUtil mathUtil = new MathUtil();
    int actual = mathUtil.divide(x,y);
    assertEquals(3, actual);
  }
}