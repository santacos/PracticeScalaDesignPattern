package tree

import org.scalatest.{Matchers, FunSuite}

/**
  * Created by santacos on 5/5/2016 AD.
  */
class TreeBuilderTest extends FunSuite with Matchers{
  test(".."){
    val tree = Node(Node (Leaf (2) ,3,Leaf (10)),3,Leaf(1))
    def sumTree(t: Tree):Int = t match {
      case Leaf(n) => n
      case Node(t1,n,t2) => sumTree(t1) + n + sumTree(t2)
    }
    sumTree(tree) shouldBe 19
  }

}
