package com.chobostudy.loustler.datastructure

import com.chobostudy.datastructure.{Branch, Leaf, Tree}

/**
  * @author loustler
  * @since 09/09/2017 17:58
  */
trait SolutionP57 {
  // exercise 3.25
  def size[A](tree: Tree[A]): Int = tree match {
    case Leaf(_)      => 1
    case Branch(l, r) => 1 + size(l) + size(r)
  }

  // exercise 3.26
  def maximum(tree: Tree[Int]): Int = tree match {
    case Leaf(a)      => a
    case Branch(l, r) => maximum(l) max maximum(r)
  }

  // exercise 3.27
  def depth[A](tree: Tree[A]): Int = tree match {
    case Leaf(_)      => 0
    case Branch(l, r) => 1 + (depth(l) max depth(r))
  }

  // exercise 3.28
  def map[A, B](tree: Tree[A])(f: A => B): Tree[B] = tree match {
    case Leaf(a)      => Leaf(f(a))
    case Branch(l, r) => Branch(map(l)(f), map(r)(f))
  }
}

object SolutionP57 extends SolutionP57
