package composition

/**
  * Created by santacos on 5/5/2016 AD.
  */
trait Cell {
  def save(x:Int)
  def retrieve:Int
}

class StandardCell(protected var state:Int) extends Cell {
  def save(x:Int) = state = x
  def retrieve = state
}

trait Similar{
  def isSimilar(x: Int): Boolean
  def isNotSimilar(x: Int): Boolean = !isSimilar(x)
}

//trait Doubling extends Cell{
//  abstract override def save(x: Int) = super.save(2*x)
//}


