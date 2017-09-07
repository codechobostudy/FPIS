package com.chobostudy.loustler.datastructure

import com.chobostudy.datastructure.{Cons, List, ListFactory, Nil}

/**
  * @author loustler
  * @since 08/18/2017 21:00
  */
trait SolutionP52 extends ListFactory with ListUtil {
  // exercise 3.11
  override def sum(x: List[Int]): Int = {
    foldLeft(x, 0)(_ + _)
  }

  // exercise 3.11
  override def product(ds: List[Double]): Double = {
    foldLeft(ds, 1.0)(_ * _)
  }

  // exercise 3.11
  override def length[A](x: List[A]): Int = {
    foldLeft(x, 0)((b, a) => b + 1)
  }

  // exercise 3.12
  def reverse[A](x: List[A]): List[A] = {
    foldLeft(x, Nil: List[A])((b, a) => Cons(a, b))
  }

  // exercise 3.13
  override def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = {
    foldLeft(reverse(as), z)((b, a) => f(a, b))
  }

  // exercise 3.14
  override def append[A](x: List[A], y: List[A]): List[A] = {
    foldRight(x, y)((a, b) => Cons(a, b))
  }

  // exercise 3.14
  def appendByFoldLeft[A](x: List[A], y: List[A]): List[A] = {
    reverse(foldLeft(y, reverse(x))((b, a) => Cons(a, b)))
  }

  // exercise 3.15
  def flatten[A](x: List[List[A]]): List[A] = {
    foldRight(x, Nil: List[A])((a, b) =>
      foldRight(a, b)((aa, bb) => Cons(aa, bb)))
  }
}

object SolutionP52 extends SolutionP52
