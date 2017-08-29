package com.chobostudy.loustler.datastructure

import com.chobostudy.datastructure._

/**
  * @author loustler
  * @since 08/12/2017 17:27
  */
trait SolutionP46 {
  // exercise 3.4
  def drop[A](x: List[A], n: Int): List[A] = x match {
    case Nil          => Nil
    case Cons(h, Nil) => if (n >= 1) Nil else x
    case Cons(h, t)   => if (n >= 1) drop(t, n - 1) else x
  }

  // exercise 3.5
  def dropWhile[A](x: List[A], f: A => Boolean): List[A] = x match {
    case Nil          => Nil
    case Cons(h, Nil) => if (f(h)) Nil else x
    case Cons(h, t)   => if (f(h)) dropWhile(t, f) else x
  }
}

object SolutionP46 extends ListFactory with SolutionP46 {}
