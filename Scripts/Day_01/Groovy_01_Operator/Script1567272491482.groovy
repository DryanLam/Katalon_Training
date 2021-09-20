// OPERATOR

// The basic integer math operators
println("5 + 3 = " + (5 + 3))
println("5 - 3 = " + (5 - 3))
println("5 * 3 = " + (5 * 3))
println("5 / 3 = " + (5 / 3))
println("5 % 3 = " + (5 % 3))

// Floating point math operators
println("1.2 + 3 = " + (1.2.plus(3)))
println("1.2 - 3 = " + (1.2.minus(3)))
println("1.2 * 3 = " + (1.2.multiply(3)))
println("1.2 / 3 = " + (1.2.div(3)))
// Special
println("5 / 3 = " + (5.intdiv(3)))

// Order of operations
println("1 + 2 * 3 = " + (1 + 2 * 3))
println("(1 + 2) * 3 = " + ((1 + 2) * 3))

// Increment and decrement
def age = 20
println("age++ = " + (age++))
println("++age = " + (++age))
println("age-- = " + (age--))
println("--age = " + (--age))

// Math Functions
println("Math.abs(-5.4) = " + (Math.abs(-5.4)))
println("Math.round(3.45) = " + (Math.round(3.45)))
println("Math.pow(3, 3) = " + (Math.pow(3, 3)))
println("Math.sqrt(9) = " + (Math.sqrt(9)))
println("Math.cbrt(27) = " + (Math.cbrt(27)))
println("Math.ceil(2.45) = " + (Math.ceil(2.45)))
println("Math.floor(2.45) = " + (Math.floor(2.45)))
println("Math.min(7,9) = " + (Math.min(7,9)))
println("Math.max(7,9) = " + (Math.max(7,9)))

// Generate random value from 1 to 100
println("Random num = " + (Math.abs(new Random().nextInt() % 100) + 1))

