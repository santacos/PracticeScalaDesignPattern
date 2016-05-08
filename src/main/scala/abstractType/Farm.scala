package abstractType

/**
  * Created by santacos on 5/8/2016 AD.
  */
object Farm {
  trait Food
  trait Animal{
    type F <: Food
    def eat(food:F) = println("yummi!")
  }

  class Glass extends Food
  class Fish extends Food

  class Cow extends Animal{
    type F = Glass
  }

  def main(args:Array[String]) = {
    val c = new Cow
    c.eat(new Glass)
  }

}
