package com.chobostudy.loustler.error

import org.scalatest.FunSuite

/**
  * @author loustler
  * @since 11/03/2017 21:52
  */
class SolutionP68Test extends FunSuite {
  test("variance should be correct") {
    val seq = List(1.0, 1.1, 1.2, 1.3, 1.4)
    val mean = seq.sum / seq.size
    val variance = seq.map(d => Math.pow(mean - d, 2)).sum / seq.size
    val expect = Option(variance)

    val result = SolutionP68.variance(seq)

    assert(result == expect)
  }
}
