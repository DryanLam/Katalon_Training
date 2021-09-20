// MAP

// List of objects with keys versus indexes
def mMap = [
  'name' : 'Dryan',
  'age' : 32,
  'address' : '123 Big Street',
  'list' : [1,2,3]
]

// Access map
println("Name " + mMap['name'])
println("Age " + mMap.get('age'))
println("List Item " + mMap['list'][1])

// Add key value
mMap.put('city', 'HoChiMinh')

// Check for key
println("Has City " + mMap.containsKey('city'))

// Size
println("Size " + mMap.size())