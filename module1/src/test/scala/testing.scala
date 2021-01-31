import org.scalatest.FunSuite

class testing extends FunSuite {
  test("Should return 0 if number is 0") {
    assert(fibonacci.fib(0) === 0)
  }
  test("Should return 1 if number is 1") {
    assert(fibonacci.fib(1) === 1)
  }
  test("Should return not defined if number is divisible by 0") {
    assertThrows[ArithmeticException]{
      fibonacci.getDivide(10,0)
    }
  }
}
