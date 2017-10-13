package com.chobostudy.loustler.datastructure

import com.chobostudy.datastructure.{Branch, Leaf, Tree}

/**
  * @author loustler
  * @since 09/15/2017 20:22
  */
trait SolutionP58 extends SolutionP57 {
  // exercise 3.29
  def fold[A, B](tree: Tree[A])(f: (A) => B)(g: (B, B) => B): B =
    tree match {
      case Leaf(a)             => f(a)
      case Branch(left, right) => g(fold(left)(f)(g), fold(right)(f)(g))
    }

  // exercise 3.29
  override def size[A](tree: Tree[A]): Int = {
    fold(tree)((a) => 1)((l, r) => 1 + l + r)
  }

  // exercise 3.29
  override def maximum(tree: Tree[Int]): Int = {
    fold(tree)(a => a)((left, right) => left max right)
  }

  // exercise 3.29
  override def depth[A](tree: Tree[A]): Int = {
    fold[A, Int](tree)(a => 0)((left, right) => 1 + (left max right))
  }

  // exercise 3.29
  override def map[A, B](tree: Tree[A])(f: (A) => B): Tree[B] = {
    fold[A, Tree[B]](tree)(a => Leaf(f(a)))(
      (left, right) => Branch(left, right))
  }
}

object SolutionP58 extends SolutionP58
