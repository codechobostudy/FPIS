package com.chobostudy.loustler.datastructure

import com.chobostudy.datastructure.{Cons, List, ListFactory, Nil}

import scala.annotation.tailrec

/**
  * @author loustler
  * @since 08/18/2017 20:42
  */
private[loustler] trait ListUtil extends ListFactory {
  // Move from SolutionP51
  // exercise 3.9
  def length[A](x: List[A]): Int = {
    foldRight(x, 0)((_, y) => y + 1)
  }

  // Move from SolutionP51
  // exercise 3.10
  @tailrec
  final def foldLeft[A, B](x: List[A], z: B)(f: (B, A) => B): B = x match {
    case Nil        => z
    case Cons(h, t) => foldLeft(t, f(z, h))(f)
  }
}
