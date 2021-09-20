// RANGE

// Ranges represent
def oneTo10 = 1..10
def aToZ = 'a'..'z'
def zToA = 'z'..'a'
println(oneTo10)
println(aToZ)
println(zToA)

// Get size
println("Size " + oneTo10.size())

// get index
println("2nd Item " + oneTo10.get(1))

// Check if range contains
println("Contains 11 " + oneTo10.contains(11))

// Get last item
println("Get Last " + oneTo10.getTo())
println("Get First " + oneTo10.getFrom())

def x = 5
def y = 10
def numbers = x..<y

for (def n : numbers) {
	println n;
}

def numbers_02 = 1..<5
for (def n : numbers_02) {
	println n;
}
