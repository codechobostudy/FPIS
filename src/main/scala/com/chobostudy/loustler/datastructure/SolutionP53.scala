package com.chobostudy.loustler.datastructure

import com.chobostudy.datastructure._
import SolutionP52.flatten

/**
  * @author loustler
  * @since 08/25/2017 20:18
  */
trait SolutionP53 extends ListUtil {
  // exercise 3.16
  def increaseElement(l: List[Int]): List[Int] = {
    foldRight(l, Nil: List[Int])((a, b) => Cons(a + 1, b))
  }

  // exercise 3.17
  def doubleToString(l: List[Double]): List[String] = {
    foldRight(l, Nil: List[String])((a, b) => Cons(a.toString, b))
  }

  // exercise 3.18
  def map[A, B](l: List[A])(f: A => B): List[B] = l match {
    case Cons(h, Nil) => Cons(f(h), Nil)
    case Cons(h, t)   => Cons(f(h), map(t)(f))
  }

  // exercise 3.19
  def filter[A](l: List[A])(f: A => Boolean): List[A] = l match {
    case Cons(h, Nil) => if (f(h)) l else Nil
    case Cons(h, t)   => if (f(h)) Cons(h, filter(t)(f)) else filter(t)(f)
  }

  // exercise 3.20
  def flatMap[A, B](l: List[A])(f: A => List[B]): List[B] = {
    flatten(map(l)(f))
  }

  // exercise 3.21
  def filterViaFlatMap[A](l: List[A])(f: A => Boolean): List[A] = {
    flatMap(l)(x => if (f(x)) Cons(x, Nil) else Nil)
  }
}

object SolutionP53 extends ListFactory with SolutionP53
