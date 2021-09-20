// LIST

// Define list
def primes = [2,3,5,7,11,13]

// Get the length
println("Length " + primes.size())

// Concatenate 2 Lists
println (primes + [29,31])

// Append to the right
primes<<19
println primes

primes.add(23)
println primes

// Remove the last item
primes - [31]

// Get a value by index
println("2nd Prime " + primes[1])
println("3rd Prime " + primes.get(2))

// Check if empty
println("Is empty " + primes.isEmpty())

// Get matches
println("Matches " + primes.intersect([2,3,7]))

// Reverse
println("Reverse " + primes.reverse())

// Sorted
println("Sorted " + primes.sort())

// Pop last item
println("Last " + primes.pop())

// They can hold anything
def mulList = [1, "Dryan", 4, 3.75, [1,2,3]]
println("2nd Number of final list: " + mulList[4][1])



