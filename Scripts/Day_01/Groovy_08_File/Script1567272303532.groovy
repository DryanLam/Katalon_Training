// FILE I.O

// Session 1
// Get project path
def curDir = System.getProperty("user.dir")
println curDir

// Open a file, read each line and output them
new File("${curDir}\\Test Cases\\Day_01\\test.txt").eachLine {
  line -> println "$line"
}

new File(".\\Test Cases\\Day_01\\test.txt").eachLine {
	line -> println "$line"
}

// Session 2
// Overwrite the file
new File(".\\Test Cases\\Day_01\\test.txt").withWriter('utf-8') {
  writer -> writer.writeLine("This message overwrite the file")
}

// Session 3
// Append the file
def file = new File(".\\Test Cases\\Day_01\\test.txt")
file.append('This message append to the file')

// Session 4
// Get the file as a string
def file = new File(".\\Test Cases\\Day_01\\test.txt")
println(file.text)

// Get the file size
// >> Should check file size in property
println("File Size : ${file.length()} bytes")

// Check if a file or directory
println("File : ${file.isFile()}")
println("Dir : ${file.isDirectory()}")

// Copy file to another file
def newFile = new File(".\\Test Cases\\Day_01\\test_copy.txt")
newFile << file.text

// Delete a file
newFile.delete()

