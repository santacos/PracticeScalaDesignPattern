package fizzBuzz

import org.scalatest.{Matchers, FunSuite}

/**
  * Created by santacos on 4/28/2016 AD.
  */
class FizzBuzzTest extends FunSuite with Matchers{

  test("Function should return Fizz when the number can be divided by 3."){
    FizzBuzz.checkNumber(3) shouldBe "Fizz"
  }

  test("Function should not return Fizz when the number can't be divided by 3."){
    FizzBuzz.checkNumber(4) shouldNot equal("Fizz")
  }

  test("Function should return Buzz when the number can be divided by 5."){
    FizzBuzz.checkNumber(10) shouldBe "Buzz"
  }

  test("Function should not return Buzz when the number can't be divided by 5."){
    FizzBuzz.checkNumber(13) shouldNot equal("Buzz")
  }

  test("Function should return FizzBuzz when the number can be divided By 3 and 5."){
    FizzBuzz.checkNumber(15) shouldBe "FizzBuzz"
  }

  test("Else case for the rest of number should return that number."){
    FizzBuzz.checkNumber(1) shouldBe "1"
  }

  test("Group of number"){
    (1 to 10).map(FizzBuzz.checkNumber) shouldBe Vector("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz")
  }


}
