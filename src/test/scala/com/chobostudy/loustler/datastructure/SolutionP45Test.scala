package com.chobostudy.loustler.datastructure

import org.scalatest.FunSuite

/**
  * @author loustler
  * @since 08/11/2017 21:56
  */
class SolutionP45Test extends FunSuite {
  test("The result of retrieve tail from the list should be (2, Nil)") {
    val l = SolutionP45(1, 2)
    val expect = SolutionP45(2)

    val result = SolutionP45.tail(l)

    assert(!SolutionP45.isEmpty(l))
    assert(result == expect)
  }

  test("The head on the list should be changed") {
    val head = 2
    val l = SolutionP45(1, 3)
    val expect = SolutionP45(head, 3)

    val result = SolutionP45.setHead(l, head)

    assert(!SolutionP45.isEmpty(l))
    assert(!SolutionP45.isEmpty(result))
    assert(expect == result)
  }
}
