package com.chobostudy.datastructure

/**
  * Don't edit this.
  *
  * If you want edit to extends it.
  *
  * @author loustler
  * @since 08/11/2017 20:01
  */
trait List[+A] {}

object List extends ListFactory {}

case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A] // tail is covariant
