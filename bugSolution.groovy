def myList = [1, 2, 3, 4, 5]

def myMethod(list) {
  def iterator = list.iterator()
  while (iterator.hasNext()) {
    def it = iterator.next()
    println it
    if (it == 3) {
      iterator.remove()
    }
  }
}

myMethod(myList)