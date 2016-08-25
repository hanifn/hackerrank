def sumPairs(a: Array[Int], k: Int) = {
  def divisible(pair: (Int, Int)): Boolean = {
    (a(pair._1) + a(pair._2)) % k == 0
  }

  (for {
    i <- 0 until a.length
    j <- 1 until a.length
    if (i < j)
  } yield (i, j)).filter(divisible)
}



sumPairs(Array(1, 3, 2, 6, 1, 2), 3).length // 5