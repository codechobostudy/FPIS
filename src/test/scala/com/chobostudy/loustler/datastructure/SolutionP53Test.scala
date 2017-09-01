package com.chobostudy.loustler.datastructure

import org.scalatest.FunSuite

/**
  * @author loustler
  * @since 08/25/2017 20:22
  */
class SolutionP53Test extends FunSuite {
  test("All of elements in the list should be increased") {
    val l = SolutionP53(0, 1, 2, 3, 4, 5)
    val expect = SolutionP53(1, 2, 3, 4, 5, 6)

    val result = SolutionP53.increaseElement(l)

    assertResult(expect)(result)
  }

  test("The double list should be string list") {
    val l = SolutionP53(0.0, 1.0, 2.0, 3.0, 4.0)
    val expect = SolutionP53("0.0", "1.0", "2.0", "3.0", "4.0")

    val result = SolutionP53.doubleToString(l)

    assertResult(expect)(result)
  }

  test("The int list should be string list by map") {
    val l = SolutionP53(1, 2, 3, 4, 5)
    val expect = SolutionP53("1", "2", "3", "4", "5")

    val result = SolutionP53.map(l)(_.toString)

    assertResult(expect)(result)

    val result2 = SolutionP53.map(expect)(_.toInt)

    assertResult(result2)(l)
  }

  test("The number list should be removed odd") {
    val l = SolutionP53(1, 2, 3, 4, 5, 6)
    val expect = SolutionP53(2, 4, 6)

    val result = SolutionP53.filter(l)(n => n % 2 == 0)

    assertResult(expect)(result)
  }

  test("The list should be other list by flatMap") {
    val l = SolutionP53(1, 2, 3, 4, 5, 6)
    val expect = SolutionP53(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6)

    val result = SolutionP53.flatMap(l)(x => SolutionP53(x, x))

    assertResult(expect)(result)
  }

  test("The number list should be odd number list via flatMap") {
    val l = SolutionP53(1, 2, 3, 4, 5, 6)
    val expect = SolutionP53(2, 4, 6)

    val result = SolutionP53.filterViaFlatMap(l)(x => x % 2 == 0)

    assertResult(expect)(result)
  }
}
