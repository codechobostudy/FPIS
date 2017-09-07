package com.chobostudy.loustler.datastructure

import org.scalatest.FunSuite

/**
  * @author loustler
  * @since 08/25/2017 21:27
  */
class SolutionP54Test extends FunSuite {
  test("Two list should be merge") {
    val l1 = SolutionP54(1, 2, 3, 4)
    val l2 = SolutionP54(5, 6, 7, 8)

    val expect = SolutionP54(6, 8, 10, 12)

    val result = SolutionP54.mergeAdd(l1, l2)

    assertResult(expect)(result)

    val l3 = SolutionP54(1, 2, 3, 4)
    val l4 = SolutionP54(5, 6, 7)

    val expect2 = SolutionP54(6, 8, 10)

    val result2 = SolutionP54.mergeAdd(l3, l4)

    assertResult(expect2)(result2)

    val l5 = SolutionP54(1, 2, 3)
    val l6 = SolutionP54(4, 5, 6, 7)

    val expect3 = SolutionP54(5, 7, 9)

    val result3 = SolutionP54.mergeAdd(l5, l6)

    assertResult(expect3)(result3)
  }

  test("Two list should be merge by zipWith") {
    val l1 = SolutionP54(1, 2, 3, 4)
    val l2 = SolutionP54(5, 6, 7, 8)
    val f = (x: Int, y: Int) => x + y

    val expect = SolutionP54(6, 8, 10, 12)

    val result = SolutionP54.zipWith(l1, l2)(f)

    assertResult(expect)(result)

    val l3 = SolutionP54(1, 2, 3, 4)
    val l4 = SolutionP54(5, 6, 7)

    val expect2 = SolutionP54(6, 8, 10)

    val result2 = SolutionP54.zipWith(l3, l4)(f)

    assertResult(expect2)(result2)

    val l5 = SolutionP54(1, 2, 3)
    val l6 = SolutionP54(4, 5, 6, 7)

    val expect3 = SolutionP54(5, 7, 9)

    val result3 = SolutionP54.zipWith(l5, l6)(f)

    assertResult(expect3)(result3)
  }
}
