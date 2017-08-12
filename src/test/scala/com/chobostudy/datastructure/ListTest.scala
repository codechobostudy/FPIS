package com.chobostudy.datastructure

import org.scalatest.FunSuite

/**
  * @author loustler
  * @since 08/11/2017 20:34
  */
class ListTest extends FunSuite {
  test("The sum of all of list should be 10") {
    val l = List(1, 2, 3, 4)
    val expect = 10

    val result = List.sum(l)

    assert(!List.isEmpty(l))
    assert(result == expect)
  }

  test("The product of all of the list should be 120") {
    val l = List(1.0, 2.0, 3.0, 4.0, 5.0)
    val expect = 120

    val result = List.product(l)

    assert(!List.isEmpty(l))
    assert(result == expect)
  }

  test("The list should be appended") {
    val l = List(1, 2, 3)
    val l2 = List(4, 5, 6)

    val expect = List(1, 2, 3, 4, 5, 6)
    val result = List.append(l, l2)

    assert(!List.isEmpty(l))
    assert(!List.isEmpty(l2))
    assert(!List.isEmpty(expect))
    assert(!List.isEmpty(result))
    assertResult(expect)(result)
  }
}
