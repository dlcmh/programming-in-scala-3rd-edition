// Although arg may seem to be a var, because it will get a new value on each
//   iteration, it really is a val: arg can't be reassigned inside the body of
//   the for expression. Instead, for each element of the args array, a new arg
//   val will be created and initialized to the element value, and the body of
//   the for will be executed.

for (arg <- args)
  println(arg)
