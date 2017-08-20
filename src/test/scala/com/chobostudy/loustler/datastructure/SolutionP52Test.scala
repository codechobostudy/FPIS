package com.chobostudy.loustler.datastructure

import org.scalatest.FunSuite

/**
  * @author loustler
  * @since 08/18/2017 21:07
  */
class SolutionP52Test extends FunSuite {
  test("The sum of all of list elements should be 15") {
    val l = SolutionP52(1, 2, 3, 4, 5)
    val expect = 1 to 5 sum

    val result = SolutionP52.sum(l)

    assert(expect == result)
  }

  test("The product of all of the list elemetns should be 120") {
    val l = SolutionP52(1.0, 2.0, 3.0, 4.0, 5.0)
    val expect = 1 to 5 product

    val result = SolutionP52.product(l)

    assert(expect.toDouble == result)
  }

  test("The length of list should be 8") {
    val l = SolutionP52(1, 2, 3, 4, 5, 6, 7, 8)
    val expect = 8

    val result = SolutionP52.length(l)

    assert(expect == result)
  }

  test("The list should be reversed") {
    val l = SolutionP52(1, 2, 3, 4, 5, 6)
    val expect = SolutionP52(6, 5, 4, 3, 2, 1)

    val result = SolutionP52.reverse(l)

    assertResult(expect)(result)
  }

  test("FoldRight should be such as FoldLeft") {
    val l = SolutionP52(1, 2, 3, 4, 5)

    val result1 = SolutionP52
      .foldLeft(l, 1)((a, b) => a * 2)

    val result2 = SolutionP52
      .foldRight(l, 1)((b, a) => a * 2)

    assertResult(result1)(result2)
  }

  test("The list should be appended") {
    val l = SolutionP52(1, 2, 3, 4, 5)
    val l2 = SolutionP52(6, 7, 8, 9, 10)
    val expect = SolutionP52(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val result = SolutionP52.append(l, l2)

    assertResult(expect)(result)
  }

  test("The list should be appended by foldRight") {
    val l = SolutionP52(1, 2, 3, 4, 5)
    val l2 = SolutionP52(6, 7, 8, 9, 10)
    val expect = SolutionP52(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val result = SolutionP52.appendByFoldLeft(l, l2)

    assertResult(expect)(result)
  }

  test("The list of list should be flatten") {
    val l = SolutionP52(
      SolutionP52(1, 2, 3, 4, 5),
      SolutionP52(6, 7, 8, 9, 10),
      SolutionP52(11, 12, 13, 14, 15),
      SolutionP52(16, 17, 18, 19, 20)
    )

    val expect = SolutionP52(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
      16, 17, 18, 19, 20)

    val result = SolutionP52.flatten(l)

    assertResult(expect)(result)
  }
}
