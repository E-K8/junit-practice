package io.ek8;

import org.junit.jupiter.api.*;

import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MathUtilTest {

  @Test
  @Order(4)
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
  @Order(3)
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
  @Order(2)
  @DisplayName("should Return Three When Dividing Fifteen By Five")
  void shouldReturnThreeWhenDividingFifteenByFive() throws Exception {
    int x = 15, y = 5;
    MathUtil mathUtil = new MathUtil();
    int actual = mathUtil.divide(x, y);
    assertEquals(3, actual);
  }

  @Test
  @Order(1)
  @DisplayName("should throw exception when divided by zero")
  void shouldThrowExceptionWhenDividedByZero() {
    int x = 8, y = 0;

    MathUtil mathUtil = new MathUtil();
    Executable executable = () -> mathUtil.divide(x, y);

    assertThrows(Exception.class, executable);
  }
}