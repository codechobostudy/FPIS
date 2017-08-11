package com.chobostudy

/**
  * Reference at GenericCompanion
  *
  * @author loustler
  * @since 08/11/2017 20:53
  */
trait ObjectFactory[+C[A]] {
  protected[this] type Coll = C[_]

  def apply[A](elems: A*): C[A]
}
