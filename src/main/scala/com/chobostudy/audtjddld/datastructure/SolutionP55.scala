package com.chobostudy.loustler.datastructure

import com.chobostudy.datastructure._

/**
  * The why solution for page 55 to be trait.
  *
  * The reason enables the other packages to use it.
  *
  * @author audtjddld
  * @since 08/23/2017
  */
trait SolutionP55 {
  /*
     List(1,2,3,4) 부분 순차열 List(1,2)나 List(2,3) , List(4)는 List (1,2,3,4)의 부분 순차열이다.
   */
  // exercise 3.24
 def hasSubsequence[A](sup: List[A], sub: List[A]): Boolean = {
    def isSubsequence[A](sup: List[A], sub: List[A], result: Boolean): Boolean = sup match {
      case Cons(h1, t1) => sub match {
        case Cons(h2, t2) => {
          if(h1 == h2) isSubsequence(t1, t2, true) 
          else isSubsequence(t1, t2, false)
        }
        case Nil => result
      }
      case Nil => result
    }
    isSubsequence(startWith(sup, sub), sub, false)
  }
  
  def startWith[A](sup: List[A], sub: List[A]): List[A] = sub match {
    case Cons(h2, t2) => {
      @tailrec
      def loop(l: List[A], h2: A, count: Int): List[A] = l match {
        case Cons(h, t) => {
          println(h2)
          if (h == h2) Cons(h, t) else loop(t, h2, count + 1)
        }
        case Nil => Nil
      }
      loop(sup, h2, 0)
    }
    case Nil => {
      Nil
    }
  }
}

object SolutionP55 extends ListFactory with SolutionP55 {}
