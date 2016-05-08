trait Family{
  type M <: Mother
  class Mother(val name:String)
}

object StandardFamily extends Family{
  type M = Mother
}

val mother = new StandardFamily.M("Ladda")