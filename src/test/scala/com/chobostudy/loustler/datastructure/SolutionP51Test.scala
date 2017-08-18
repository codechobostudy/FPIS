package com.chobostudy.loustler.datastructure

import org.scalatest.FunSuite

/**
  * @author loustler
  * @since 08/18/2017 20:32
  */
class SolutionP51Test extends FunSuite {
  test("The length of List should be 5") {
    val l = SolutionP51(1, 2, 3, 4, 5)
    val expect = 5

    val result = SolutionP51.length(l)

    assert(expect == result)
  }

  test("The length of List should be 14") {
    val l = SolutionP51(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)
    val expect = 14

    val result = SolutionP51.length(l)

    assert(expect == result)
  }

  test("The sum of all of list should be 15") {
    val l = SolutionP51(1, 2, 3, 4, 5)
    val expect = 15

    val result = SolutionP51.foldLeft(l, 0)(_ + _)

    assert(expect == result)
  }
}
