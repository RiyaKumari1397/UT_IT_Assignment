object fibonacci extends TraitClass {

  def fib(n: Int) : Int = {
    if (n <= 1)
      return n
    return fib(n - 1) + fib(n - 2)
  }


  def getDivide(num1: Int, num2: Int): Int = {
    val result = num1 / num2
    return result
  }
}

