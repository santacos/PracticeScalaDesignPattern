package fizzBuzz

/**
  * Created by santacos on 4/28/2016 AD.
  */
object FizzBuzz {
  def checkNumber(number: Int):String = {
    (number % 3,number % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
      case _ => number.toString
    }
  }

}
