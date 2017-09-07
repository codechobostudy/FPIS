package com.chobostudy.loustler.datastructure

import com.chobostudy.datastructure._

/**
  * @author loustler
  * @since 08/25/2017 21:23
  */
trait SolutionP54 {
  // exercise 3.22
  def mergeAdd(x: List[Int], y: List[Int]): List[Int] = (x, y) match {
    case (Nil, _)                       => x
    case (_, Nil)                       => y
    case (Cons(h1, Nil), Cons(h2, Nil)) => Cons(h1 + h2, Nil)
    case (Cons(h1, t1), Cons(h2, t2))   => Cons(h1 + h2, mergeAdd(t1, t2))
    case (_, _)                         => Nil
  }

  // exercise 3.23
  def zipWith[A, B, C](x: List[A], y: List[B])(f: (A, B) => C): List[C] =
    (x, y) match {
      case (Nil, _)                       => Nil
      case (_, Nil)                       => Nil
      case (Cons(h1, Nil), Cons(h2, Nil)) => Cons(f(h1, h2), Nil)
      case (Cons(h1, t1), Cons(h2, t2))   => Cons(f(h1, h2), zipWith(t1, t2)(f))
      case (_, _)                         => Nil
    }
}

object SolutionP54 extends ListFactory with SolutionP54
