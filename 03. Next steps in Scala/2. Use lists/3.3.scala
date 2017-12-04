val oneTwo = List(1, 2)
val threeFour = List(3, 4)

// ::: does list concatenation - pronounced as "cons"
// in this example, ::: prepends oneTwo to threeFour
val oneTwoThreeFour = oneTwo ::: threeFour

println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")
