package com.chobostudy.datastructure

/**
  * @author loustler
  * @since 09/07/2017 00:01
  */
sealed trait Tree[+A]
case class Leaf[A](value: A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

object Tree
