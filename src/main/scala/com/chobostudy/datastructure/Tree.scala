package com.chobostudy.datastructure

/**
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