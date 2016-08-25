def cutSticks(sticks: Array[Int]): Array[Int] = {
  sticks.map(s => s - sticks.min).filter(s => s > 0)
}

def getLenArray(sticks: Array[Int]): Array[Int] = {
  def iter(arr: Array[Int], acc: List[Int]): List[Int] = {
    if (arr.isEmpty) acc
    else arr.length :: iter(cutSticks(arr), acc)
  }

  iter(sticks, Nil).toArray
}

getLenArray(Array(5, 4, 4, 2, 2, 8)).mkString("\n")