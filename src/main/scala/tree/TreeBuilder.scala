package tree

/**
  * Created by santacos on 5/5/2016 AD.
  */
class Tree
case class Node(t1: Tree,n: Int, t2: Tree) extends Tree
case class Leaf(n: Int) extends Tree

class TreeBuilder extends App{
  val tree = Node(Node (Leaf (2) ,3,Leaf (10)),3,Leaf(1))
  def sumTree(t: Tree):Int = t match {
    case Leaf(n) => n
    case Node(t1,n,t2) => sumTree(t1) + n + sumTree(t2)
  }
  println(sumTree(tree))
}
