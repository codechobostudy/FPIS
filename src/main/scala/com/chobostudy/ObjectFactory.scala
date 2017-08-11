package com.chobostudy

/**
  * Reference at GenericCompanion
  *
  * @author loustler
  * @since 08/11/2017 20:53
  */
trait ObjectFactory[+C[+A]] {
  def apply[A](elemes: A*): C[A]
}
