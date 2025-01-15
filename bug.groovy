def myList = [1, 2, 3, 4, 5]

def myMethod(list) {
  list.each { it ->
    println it
    if (it == 3) {
      list.remove(it) 
    }
  }
}

myMethod(myList)