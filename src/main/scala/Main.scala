import Character._
object Main {
  def main(args: Array[String]): Unit =
    args.headOption.foreach{ input =>
      val slackified = input.map {
        case c if isAlphabetic(c) => s":$c:"
        case c if isWhitespace(c) => ":blank:"
        case c                    => s"$c"
      }.mkString
      println(slackified)
    }
}
