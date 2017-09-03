package com.chobostudy.audtjddld.datastructure

import com.chobostudy.datastructure._

/**
 * 	this is the 57 page answer
 * @author audtjddld
 * @since 08/27/2017
 */
class SolutionP57 {
  // 3.25 트리의 노드, 즉 잎(leaf)과 가지(branch)의 개수를 세는 함수 size를 작성하여라.
  def size[A](tree: Tree[A]): (Int, Int) = {
    def travel[A](tree: Tree[A], branchCount: Int): Int = tree match {

      case Branch(left, right) => travel(right, travel(left, branchCount + 1))

      case Leaf(value)         => branchCount
    }
    val branchCount = travel(tree, 0)
    (branchCount, branchCount + 1)
  }

}