def ageOld = 7

if(ageOld == 5){
  println("Go to Kindergarten")
} else if((ageOld > 5) && (ageOld < 18)) {
  printf("Go to class %d \n", (ageOld - 5))
} else {
  println("Go to College")
}

def canVote = true
// Ternary operator
println(canVote ? "Can Vote" : "Can't Vote")

ageOld = 17
// Switch statement
switch(ageOld) {
  case 16: println("You can drive")
  case 18:
	println("You can vote")
	break;// Stops checking the rest if true
  default: println("Đợi đi")
}

// Switch with list options
switch(ageOld){
  case 0..6 : 	println("Toddler")
  				break
  case 7..12 : 	println("Child") 
  				break
  case 13..18 : println("Teenager")
  				break
  default : 	println("Adult")
}