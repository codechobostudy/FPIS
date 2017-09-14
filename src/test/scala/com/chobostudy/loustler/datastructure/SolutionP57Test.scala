package com.chobostudy.loustler.datastructure

import com.chobostudy.datastructure.{Branch, Leaf}
import org.scalatest.FunSuite

/**
  * @author loustler
  * @since 09/09/2017 18:04
  */
class SolutionP57Test extends FunSuite {
  test("The tree size should be 7") {
    /*
                    Branch
            Branch          Branch
       Leaf(5) Leaf(6)  Leaf(7) Leaf(8)
     */
    val tree = Branch(
      Branch(
        Leaf(5),
        Leaf(6)
      ),
      Branch(
        Leaf(7),
        Leaf(8)
      )
    )

    val expect = 7
    val result = SolutionP57.size(tree)

    assert(expect == result)
  }

  test("The maximum value on the Int tree should be 11") {
    val tree = Branch(
      Branch(
        Branch(
          Branch(
            Leaf(1),
            Branch(
              Leaf(3),
              Leaf(6)
            )
          ),
          Leaf(11)
        ),
        Leaf(7)
      ),
      Branch(
        Leaf(4),
        Branch(
          Leaf(2),
          Branch(
            Leaf(9),
            Leaf(10)
          )
        )
      )
    )

    val expect = 11
    val result = SolutionP57.maximum(tree)

    assert(expect == result)
  }

  test("The tree depth should be 4") {
    val tree = Branch(
      Branch(
        Branch(
          Leaf(2),
          Leaf(6)
        ),
        Leaf(1)
      ),
      Branch(
        Leaf(3),
        Branch(
          Branch(
            Leaf(7),
            Leaf(9)
          ),
          Leaf(4)
        )
      )
    )

    val expect = 4
    val result = SolutionP57.depth(tree)

    assert(expect == result)
  }

  test("The Int tree should be string tree") {
    val iTree = Branch(
      Branch(
        Leaf(1),
        Leaf(3)
      ),
      Branch(
        Branch(
          Leaf(4),
          Leaf(5)
        ),
        Branch(
          Leaf(6),
          Leaf(7)
        )
      )
    )

    val expect = Branch(
      Branch(
        Leaf("1"),
        Leaf("3")
      ),
      Branch(
        Branch(
          Leaf("4"),
          Leaf("5")
        ),
        Branch(
          Leaf("6"),
          Leaf("7")
        )
      )
    )

    val result = SolutionP57.map(iTree)(_.toString)

    assertResult(expect)(result)
  }
}
