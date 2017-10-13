package com.chobostudy.loustler.datastructure

import org.scalatest.FunSuite

import com.chobostudy.loustler.datastructure.{SolutionP55 => List}

/**
  * @author loustler
  * @since 09/06/2017 23:46
  */
class SolutionP55Test extends FunSuite {
  test("The list should be startsWith some..") {
    val l = List(3, 4, 5, 6, 7, 8)

    val elems = List(3, 4)

    assert(List.startsWith(l, elems))

    val elems2 = List(3, 4, 5)

    assert(List.startsWith(l, elems2))

    val elem3 = List(4, 5)

    assert(!List.startsWith(l, elem3))
  }

  test("The list should be has subsequence") {
    val l = List(1, 2, 3, 4, 5)
    val sequence = List(2, 3)
    val sequence2 = List(3, 4)
    val sequence3 = List(5)

    assert(List.hasSubsequence(l, sequence))
    assert(List.hasSubsequence(l, sequence2))
    assert(List.hasSubsequence(l, sequence3))
  }
}
