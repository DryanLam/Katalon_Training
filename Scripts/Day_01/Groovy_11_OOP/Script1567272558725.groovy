// OOP
import groovy.transform.ToString;
 
//--- animal.class
// Creates the toString method
//@ToString(includeNames=true, includeFields=true)
class Animal {
  // Fields/Attributes
  def name
  def sound
 
  // Constructor Method
  def Animal(name, sound){
	this.name = name
	this.sound = sound
  }

  // Methods (Capabilites)	
  def run(){
	println("${name} runs")
  }
 
  def makeSound(){
	println("${name} says ${sound}")
  }
}

def convat = new Animal("Godzilla", "Gruuuu")
convat.run()
convat.makeSound()


//--- dog.groovy
class Dog extends Animal{
  def owner
 
  // Constructor Method
  def Dog(name, sound, owner){
	super(name, sound) // Call the Animal constructor
	this.owner = owner
  }
 
  // Overwrite the Animal makeSound()
  def makeSound(){
	println("${name} says bark and ${sound}")
  }
}

Dog stDog = new Dog("Shiba Inu", "Gaugau", "Dryan")
stDog.name
stDog.run()
stDog.makeSound()

Animal ndDog = new Dog("Akita Inu", "Ang Ang", "Tui")
ndDog.name
ndDog.run()
ndDog.makeSound()

def rdDog = new Dog("Golden", "Growwww", "Thien ha")
rdDog.name
rdDog.run()
rdDog.makeSound()



//--- thing.groovy
/**
 *  An Abstract class can't be instantiated, but it
 *  can contain fields, and abstract or concrete methods
 */
abstract class Thing{
  public String name
  public Thing() {}
 
  def getInfo(){
	println("The things name is ${name}")
  }
  
  abstract abtractMethod()
}

//--- Malma.groovy
class Mammal extends Thing{
  def Mammal(name){
	this.name = name
  }
  
  def abtractMethod() {
	  println("Must implement this method")
  }
  
}

def newThing = new Mammal("Wallet")
newThing.name
newThing.getInfo()
newThing.abtractMethod()


//---Math.groovy
/**
 * An interface defines a contract that says any
 * object that inherits from it will implement
 * the methods defined by it
 * 
 * All methods are abstract
 * 
 */
interface Math {
   int add(int a, int b)

   int multiply(int a, int b)
}

class SimpleMathImpl implements Math {
   int add(int a, int b) {
      a + b
   }

   int multiply(int a, int b) {
      a * b
   }
}

def tinhtoan = new SimpleMathImpl()
println(tinhtoan.add(1, 2))
println(tinhtoan.multiply(2, 2))





