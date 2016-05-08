package composition

import org.scalatest.{Matchers, FunSuite}

/**
  * Created by santacos on 5/5/2016 AD.
  */
class StandardCellTest extends FunSuite with Matchers{
  test("create standard cell"){
    val cell = new StandardCell(3)
      with Similar { def isSimilar(x: Int): Boolean = state == x }
    cell.retrieve shouldBe 3
  }

  test("Doubling class"){
    val doubling = new StandardCell(4)
      with Similar { def isSimilar(x: Int): Boolean = state == x }
    //doubling.save(2)
    doubling.retrieve shouldBe 4
  }

}
