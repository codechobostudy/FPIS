package com.chobostudy.loustler.datastructure

import com.chobostudy.datastructure.{Cons, List, ListFactory, Nil}

import scala.annotation.tailrec

/**
  * @author loustler
  * @since 09/06/2017 00:25
  */
trait SolutionP55 {
  @tailrec
  final def startsWith[A](x: List[A], y: List[A]): Boolean = (x, y) match {
    case (_, Nil)                                 => true
    case (Cons(h1, t1), Cons(h2, t2)) if h1 == h2 => startsWith(t1, t2)
    case _                                        => false
  }

  @tailrec
  final def hasSubsequence[A](sup: List[A], sub: List[A]): Boolean = sup match {
    case Nil                       => sub == Nil // Nil is Nothing List.
    case _ if startsWith(sup, sub) => true
    case Cons(h, t)                => hasSubsequence(t, sub)
  }
}

object SolutionP55 extends ListFactory with SolutionP55
