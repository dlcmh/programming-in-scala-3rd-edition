val oneTwo = List(1, 2)
val threeFour = List(3, 4)

// ::: does list concatenation
val oneTwoThreeFour = oneTwo ::: threeFour

println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")

//  :: - pronounced as "cons"
// in this example, :: prepends 2 to threeFour
val twoThreeFour = 2 :: threeFour
println(twoThreeFour)
