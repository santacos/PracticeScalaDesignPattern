trait Family {
  type M <: Mother
  type F <: Father
  type C <: Child

  class Father(val name:String){
    def kiss(m:M) = println("Showing sign of affection towards "+ m.name)
    def pay(c:Child) = println("Paying the money to "+ c.name)
  }
  class Mother(val name:String)
  class Child(val name:String){
    def askForHelp(m:M) = println("Screammmmming at " + m.name)
  }
}

object StandardFamily extends Family{
  type F = Father ; type M = Mother ; type C = Child
}

object UpperClassFamily extends Family{
  type F = Father ; type M = Mother ; type C = PoliteChild
  class Mother(name:String, val lastName:String) extends super.Mother(name)
  class PoliteChild(name:String) extends Child(name){
    override def askForHelp(m:M) =
      println("Asking " + m.name + m.lastName + " for help")
  }
}

def assignFamily ( f : Family ) = ( )

val father = new UpperClassFamily.Father("John")
val upperClassMother = new UpperClassFamily.Mother("Dorthea", "III")
val normalChild = new StandardFamily.Child("Nemo")
val upperClassChild = new UpperClassFamily.Child("Gold nemo")
father.kiss(upperClassMother)
father.pay(upperClassChild)