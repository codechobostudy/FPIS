package com.chobostudy.loustler.datastructure

import com.chobostudy.datastructure.{Branch, Leaf, Tree}
import com.chobostudy.loustler.datastructure.{SolutionP58 => TreeImpl}
import org.scalatest.FunSuite

/**
  * @author loustler
  * @since 09/15/2017 20:31
  */
class SolutionP58Test extends FunSuite {
  test("The string which to be int tree should be int tree") {
    val tree = Branch(
      Branch(
        Leaf("3"),
        Leaf("5")
      ),
      Branch(
        Leaf("6"),
        Leaf("9")
      )
    )

    val expect = Branch(
      Branch(
        Leaf(3),
        Leaf(5)
      ),
      Branch(
        Leaf(6),
        Leaf(9)
      )
    )

    val result =
      TreeImpl.fold[String, Tree[Int]](tree)(s => Leaf(s.toInt))(
        (left, right) => Branch(left, right))

    assertResult(expect)(result)
  }

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

    val result = TreeImpl.size(tree)

    assert(expect == result)
  }

  test("The maximum value of tree should be 11") {
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
    val result = TreeImpl.maximum(tree)

    assert(expect == result)
  }

  test("The depth of Tree should be 4") {
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
    val result = TreeImpl.depth(tree)

    assert(expect == result)
  }

  test("The int tree should be string tree") {
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

    val result = TreeImpl.map(expect)(_.toString)

    assertResult(expect)(result)
  }
}
