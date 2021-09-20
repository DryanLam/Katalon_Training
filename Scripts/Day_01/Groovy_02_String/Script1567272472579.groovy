// STRING

// Define string
def name = "Dryan"
println('I am ${name}')
println("I am ${name}")
println("My Name " + name)
println("My Name ".concat(name))

// Get string length
println("Size " + name.length())
// Check for equality
println('Dryan'.equals('Dryan'))
println('Dryan'.equalsIgnoreCase('dryan'))

// Get string by index
println("3rd Index of Name " + name[3])
println("Index of r " + name.indexOf('r'))

// Get a slice
println("1st 3 Characters " + name[0..2])

// Get specific Characters
println("Every Other Character " + name[0,2,4])
println("Substring at 1 " + name.substring(1))
println("Substring at 1 to 4 " + name.substring(1,4))

// Repeat a string
def repeatStr = "What I said is " * 2
println(repeatStr)

// Split the string
println(repeatStr.split(' '))
println(repeatStr.toList())

// Replace all strings
println(repeatStr.replaceAll('I', 'she'))

// Uppercase and lowercase
println("Uppercase " + repeatStr.toUpperCase())
println("Lowercase " + repeatStr.toLowerCase())

// Define mutli-string line
def mulString = '''
this is 
multiple string 
lying many lines
'''
println(mulString)