package io.ek8;

import org.junit.jupiter.api.*;

import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MathUtilTest {
  MathUtil mathUtil;

  @BeforeAll
  static void beforeAll() {
    System.out.println("before all");
  }

  @AfterAll
  static void afterAll() {
    System.out.println("after all");
  }

  @BeforeEach
  void setUp() {
    System.out.println("before each setup");
    mathUtil = new MathUtil();
  }

  @AfterEach
  void tearDown() {
    System.out.println("after each tear down");
    mathUtil = null;
  }

  @Test
  @Order(4)
  @DisplayName("should Return Three When Adding Two And One")
  void shouldReturnThreeWhenAddingTwoAndOne() {
//    given
    int x = 2, y = 1;
//    when
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
    int actual = mathUtil.subtract(x, y);
//    then
    assertEquals(9, actual);
  }

  @Test
  @Order(2)
  @DisplayName("should Return Three When Dividing Fifteen By Five")
  void shouldReturnThreeWhenDividingFifteenByFive() throws Exception {
    int x = 15, y = 5;
    int actual = mathUtil.divide(x, y);
    assertEquals(3, actual);
  }

  @Test
  @Order(1)
  @DisplayName("should throw exception when divided by zero")
  void shouldThrowExceptionWhenDividedByZero() {
    int x = 8, y = 0;

    Executable executable = () -> mathUtil.divide(x, y);

    assertThrows(Exception.class, executable);
  }

  @Test
  @DisplayName("should return null if the first parameter is zero")
  void shouldReturnNullIfXIsZero() throws Exception {
    assertNull(mathUtil.divide(0, 5));
  }

  @Test
  @DisplayName("should not return null if the first parameter is not zero")
  void shouldNotReturnNullIfXIsNotZero() throws Exception {
    assertNotNull(mathUtil.divide(15, 5));
  }

  @ParameterizedTest(name = "X={0}, Y={1}")
  @CsvSource(value = {"11, 4", "12, 3"})
  void testingAdd(int x, int y) {
    assertEquals(15, mathUtil.add(x, y));
  }

  @Test
  @DisplayName("isEven should return true")
  void isEvenShouldReturnTrue() {
    assertTrue(mathUtil.isEven(2));
    assertTrue(mathUtil.isEven(4));
    assertTrue(mathUtil.isEven(6));
    assertTrue(mathUtil.isEven(8));
  }

  @Test
  @DisplayName("isEven should return false")
  void isEvenShouldReturnFalse() {
    assertAll(
        () -> assertFalse(mathUtil.isEven(1)),
        () -> assertFalse(mathUtil.isEven(3)),
        () -> assertFalse(mathUtil.isEven(5)),
        () -> assertFalse(mathUtil.isEven(7))
    );
  }
}