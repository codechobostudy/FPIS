package com.chobostudy.audtjddld.datastructure

import org.scalatest.FunSuite

import com.chobostudy.datastructure._

/**
 * @author audtjddld
 * @since 08/24/2017
 */
class SolutionP55Test extends FunSuite {
  test("this test case that check of hasSubsequence. ex) List(1,2,3,4) hasSubsequence List(1,2)") {

    val expect = true
    val result = SolutionP55.hasSubsequence(List(1, 2, 3, 4), List(1, 2))

    assert(result == expect)
  }

  test("this test case that check of hasSubsequence. ex) List(1,2,3,4) hasSubsequence List(2,3)") {
    val expect = true
    val result = SolutionP55.hasSubsequence(List(1, 2, 3, 4), List(2, 3))

    assert(result == expect)
  }

  test("this test case that check of hasSubsequence. ex) List(1,2,3,4) hasSubsequence List(4)") {
    val expect = true
    val result = SolutionP55.hasSubsequence(List(1, 2, 3, 4), List(4))

    assert(result == expect)
  }
}
