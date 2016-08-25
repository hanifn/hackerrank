def maxLimit(nums: List[Int], limit: Int): Int = {
  def max(list: List[Int], n: Int): Int = {
    if (n == 0 || list.isEmpty) 0
    else if (list.head > n) max(list.tail, n)
    else list.head + max(nums, n - list.head)
  }

  max(nums, limit) max max(nums.tail, limit)
}

maxLimit(List(3, 10, 4), 12) // 12
maxLimit(List(3, 10, 4), 13) // 13
maxLimit(List(3, 10, 4), 16) // 16
maxLimit(List(9, 9, 9), 9) // 9
maxLimit(List(9, 9, 9), 8) // 0
maxLimit(List(3, 4, 4, 4, 8), 9) // 9