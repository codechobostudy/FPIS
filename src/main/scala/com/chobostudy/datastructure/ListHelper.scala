package com.chobostudy.datastructure

import scala.annotation.tailrec

/**
  * @author loustler
  * @since 08/11/2017 21:16
  */
trait ListHelper {
  def size[A](x: List[A]): Int = {
    @tailrec
    def loop(i: Int, y: List[A]): Int = y match {
      case Nil          => i
      case Cons(h, Nil) => i + 1
      case Cons(h, t)   => loop(i + 1, t)
    }

    loop(0, x)
  }

  def getHead[A](x: List[A]): A = x match {
    case Nil =>
      sys.error("Can not find head element, cause the given list is Nil.")
    case Cons(h, _) => h
  }

  def isEmpty[A](x: List[A]): Boolean = x match {
    case Nil => true
    case _   => false
  }

  def has[A](x: List[A], e: A): Boolean = x match {
    case Nil          => sys.error("The given list is Nil")
    case Cons(h, Nil) => if (h == e) true else false
    case Cons(h, t)   => if (h == e) true else has(t, e)
  }

  def append[A](x: List[A], y: List[A]): List[A] = x match {
    case Nil        => y
    case Cons(h, t) => Cons(h, append(t, y))
  }
}
