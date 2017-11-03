package com.chobostudy.loustler.error

import com.chobostudy.loustler.error.Option

/**
  * @author loustler
  * @since 11/03/2017 21:19
  */
trait SolutionP68 {
  def mean(xs: Seq[Double]): Option[Double] = {
    Option(xs.sum / xs.size)
  }

  // exercise 4.2
  def variance(xs: Seq[Double]): Option[Double] = {
    Option(xs).flatMap(x => {
      val meanV = mean(xs).getOrElse(0.0)

      mean(xs.map(d => math.pow(meanV - d, 2)))
    })
  }
}

object SolutionP68 extends SolutionP68
