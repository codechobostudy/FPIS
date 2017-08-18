package com.chobostudy.loustler.datastructure

import org.scalatest.FunSuite

import com.chobostudy.datastructure._

/**
  * @author loustler
  * @since 08/12/2017 17:33
  */
class SolutionP46Test extends FunSuite {
  test("The list should be reduced") {
    val l = List(1, 2, 3, 4, 5)
    val expect = List(4, 5)

    val result = SolutionP46.drop(l, 3)

    assert(!List.isEmpty(l))
    assert(!List.isEmpty(expect))
    assert(!List.isEmpty(result))
    assertResult(expect)(result)
  }

  test("The list should be not reduced") {
    val o = List(5, 6, 7, 8)
    val l = o
    val expect = o

    val result = SolutionP46.dropWhile[Int](l, n => n < 5)

    assert(!List.isEmpty(l))
    assert(!List.isEmpty(expect))
    assert(!List.isEmpty(result))
    assertResult(expect)(result)
  }

  test("The list should be reduced by predicate") {
    val o = List(1, 2, 3, 4)
    val l = o
    val expect = List()

    val result = SolutionP46.dropWhile[Int](l, n => n < 5)

    assert(!List.isEmpty(l))
    assert(List.isEmpty(expect))
    assert(List.isEmpty(result))
    assertResult(expect)(result)
  }
}
