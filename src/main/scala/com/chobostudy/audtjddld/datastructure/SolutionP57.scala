package com.chobostudy.audtjddld.datastructure

import com.chobostudy.datastructure._

/**
 * 	this is the 57 page answer
 * @author audtjddld
 * @since 08/27/2017
 */
trait SolutionP57 {
  // 3.25 트리의 노드, 즉 잎(leaf)과 가지(branch)의 개수를 세는 함수 size를 작성하여라.
  def size[A](tree: Tree[A]): (Int, Int) = {
      def travel[A](tree: Tree[A], branchCount: Int): Int = tree match {

        case Branch(left, right) => travel(right, travel(left, branchCount + 1))

        case Leaf(value)         => branchCount
      }
    val branchCount = travel(tree, 0)
    (branchCount, branchCount + 1)
  }

  // 3.26
  def maximum(tree: Tree[Int]) = {
      def travel(tree: Tree[Int], m: Int): Int = tree match {
        case Branch(left, right) => travel(right, travel(left, m))
        case Leaf(value)         => value max m
      }
    travel(tree, 0)
  }

  // 3.27
  def maxdepth[A](tree: Tree[A]): Int = tree match {
    case Leaf(_)             => 0
    case Branch(left, right) => 1 + (maxdepth(left) max maxdepth(right))
  }

  // 3.28
  def map[A, B](tree: Tree[A])(f: A => B): Tree[B] = tree match {
    case Leaf(a)      => Leaf(f(a))
    case Branch(l, r) => Branch(map(l)(f), map(r)(f))
  }
  
}