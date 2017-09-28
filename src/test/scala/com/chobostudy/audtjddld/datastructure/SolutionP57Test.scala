package com.chobostudy.audtjddld.datastructure

import com.chobostudy.datastructure._
import org.scalatest.FunSuite

/**
 * @author audtjddld
 * @since 08/27/2017
 */
class SolutionP57Test extends FunSuite {
  val tree = Branch(Leaf(1), Leaf(2))
  val tree2 = Branch(tree, Leaf(3))
  // this test case that check of datastructure of tree, what it is referenced class of Tree.scala
  test("question number 3.25. how to count branch and leaf in a tree") {
    val result = SolutionP57.size(tree)
    
    val respect = (1, 2)
    
    assert(result == respect)
    
    val result2 = SolutionP57.size(tree2)
    assert(result2 != respect)
  }
  
  test("question number 3.26. how to max value of a Leaf in a tree") {
    val result = SolutionP57.maximum(tree)
    
    var respect = 2;
    
    assert(result == respect)
    
    val result2 = SolutionP57.maximum(tree2)
    
    respect = 3;
    
    assert(result2 == respect)
  }
  
  test("question number 3.27 how to max depth in a tree") {
    val result = SolutionP57.maxdepth(tree)
    
    var respect = 1;
    
    assert(result == respect)
    
    respect = 2
    
    val result2 = SolutionP57.maxdepth(tree2)
    
    assert(result2 == respect)
  }
  
  test("question number 3.28 how to apply a function to change the value of a leaf in a tree") {
    val result = SolutionP57.map(tree)((a) => a + 1)
    
    val applyingTree = Branch(Leaf(2), Leaf(3))
    
    assert(result == applyingTree)
  }
}