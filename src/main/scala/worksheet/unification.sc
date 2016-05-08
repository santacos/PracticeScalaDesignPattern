object moduleA {
  class A
}
class ModuleB {
  class A
}


val a1 = new moduleA.A

//path-dependent types
val moduleB = new ModuleB
val a2 = new moduleB.A

// getClass returns the runtime class when invoked

//The exact type depends on the runtime
// identity of the actual objects involved in the path.
println(a1.getClass == a1.getClass)
println(a1.getClass == a2.getClass)
()
