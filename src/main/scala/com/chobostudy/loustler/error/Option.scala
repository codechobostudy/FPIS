package com.chobostudy.loustler.error

/**
  * @author loustler
  * @since 10/13/2017 20:41
  */
trait Option[+A] {
  // exercise 4-1
  def map[B](f: A => B): Option[B] = this match {
    case None    => None
    case Some(x) => Some(f(x))
  }

  // exercise 4-1
  def flatMap[B](f: A => Option[B]): Option[B] = this match {
    case None    => None
    case Some(x) => f(x)
  }

  // exercise 4-1
  def getOrElse[B >: A](default: => B): B = this match {
    case None    => default
    case Some(x) => x
  }

  // exercise 4-1
  def orElse[B >: A](ob: => Option[B]): Option[B] = this match {
    case None    => ob
    case Some(_) => this
  }

  // exercise 4-1
  def filter(f: A => Boolean): Option[A] = this match {
    case Some(x) if f(x) => this
    case _               => None
  }
}

case class Some[+A](get: A) extends Option[A]
case object None extends Option[Nothing]
