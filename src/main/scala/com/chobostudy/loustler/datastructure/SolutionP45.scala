package com.chobostudy.loustler.datastructure

import com.chobostudy.datastructure.{Cons, List, ListFactory, Nil}

/**
  * The why solution for page 45 to be trait.
  *
  * The reason enables the other packages to use it.
  *
  * @author loustler
  * @since 08/11/2017 19:58
  */
trait SolutionP45 {
  // exercise 3.2
  def tail[A](x: List[A]): List[A] = x match {
    case Nil        => Nil
    case Cons(h, t) => t
  }

  // exercise 3.3
  def setHead[A](xs: List[A], x: A): List[A] = xs match {
    case Nil        => Cons(x, Nil)
    case Cons(t, h) => Cons(x, h)
  }
}

object SolutionP45 extends ListFactory with SolutionP45 {}
