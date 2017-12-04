val numNames = Array("zero", "one", "two")
println(numNames(0), numNames(1), numNames(2))

// alternative using the apply method on the Array companion object, which is
// conceptually similar to a static method named apply on class Array in Java
val numNames2 = Array.apply("zero", "one", "two")
println(numNames2(0), numNames2(1), numNames2(2))
