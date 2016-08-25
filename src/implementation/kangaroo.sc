def willMeet(x1: Int, v1: Int, x2: Int, v2: Int): Boolean = {
  if ((x1 < x2 && v1 <= v2) || (x1 > x2 && v1 >= v2)) false
  else if (x1 == x2) true
  else willMeet(x1 + v1, v1, x2 + v2, v2)
}

willMeet(0, 3, 4, 2)
willMeet(0, 2, 5, 3)
willMeet(43, 2, 70, 2)