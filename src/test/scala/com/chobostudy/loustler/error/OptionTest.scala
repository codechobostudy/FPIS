package com.chobostudy.loustler.error

import org.scalatest.FunSuite

/**
  * @author loustler
  * @since 10/13/2017 21:01
  */
class OptionTest extends FunSuite {
  test("Option should be map") {
    val none = None
    val some = Some(5)

    assert(none.map(n => 5) == None)
    assert(some.map(_ + 3) == Some(8))
  }

  test("Option should be flat") {
    val none = None
    val some = Some(7)

    assert(none.flatMap(n => Some(5)) == None)
    assert(some.flatMap(x => Some(11)) == Some(11))
  }

  test("Option should be get else if none") {
    val none = None
    val some = Some(10)

    val default = 30

    assert(none.getOrElse(default) == default)
    assert(some.getOrElse(default) != default)
  }

  test("Option should be else if none") {
    val none = None
    val some = Some(10)

    val op = Some(30)

    assert(none.orElse(op) == op)
    assert(some.orElse(op) != op)
  }

  test("Option should be filter") {
    val none = None
    val some = Some(10)

    assert(none.filter(x => x == 10) == None)
    assert(some.filter(x => x == 10) == Some(10))
  }
}
