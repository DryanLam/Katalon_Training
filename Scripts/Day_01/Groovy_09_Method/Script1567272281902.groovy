// METHOD

// Method without parameter
def sayHello(){
  println("Hello")
}

// Method with parameter
def sayHello(params){
  println("Hello, " + params)
}

// Static method
static def sayGoodbye(){
	println("Good bye!")
}

sayGoodbye()

// Method has return value
def setText_01(value){
	return "Text is set ${value}"
}

def setText_02(value){
	"Text is set ${value}"
}

sayHello()
sayHello("Automation Test!!!")
println setText_01("trial")
println setText_02("trial")


// Methods can receive parameters that have default values
def getSum(num1=0, num2=0){
  return num1 + num2
}

println getSum(2,3)

// Pass unknown number of elements to a method -Any object
def sumAll(int... num){
  def sum = 0
  
  // Performs a calculation on every item with each
  num.each { sum += it}
  return sum
}

println sumAll(2,3,5,7)

