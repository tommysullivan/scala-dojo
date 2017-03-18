package cli

import primitives.{False, True}

object Cli {
  def main(args: Array[String]) = println(True.negate.negate.negate.equal(False).toString)
}



