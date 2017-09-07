package com.chobostudy.datastructure

/**
<<<<<<< HEAD
 * Don't edit this.
 *
 * If you want edit to extends it.
 *
 * @author audtjddld
 * @since 08/27/2017
 */
trait Tree[+A]
case class Leaf[A](value: A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]
=======
  * @author loustler
  * @since 09/07/2017 00:01
  */
sealed trait Tree[+A]
case class Leaf[A](value: A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

object Tree
>>>>>>> 8d3ee3273e7ea91c93b79305e45f1fbd2c81fc23
