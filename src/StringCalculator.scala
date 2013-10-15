import java.io.PrintStream

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworks
 * Date: 10/15/13
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
class StringCalculator {

  def add(inputString: String): Int = {
    var result = 0
    if (!inputString.isEmpty) {
      if (inputString.contains(",")) {
        val parsedIntegers: Array[String] = inputString.split(",")
        for (string <- parsedIntegers)
          result += add(string)
      }
      else if (inputString.contains("\n")) {
        val parsedIntegers: Array[String] = inputString.split("\n")
        for (string <- parsedIntegers)
          result += add(string)
      }
      else
        result = inputString.toInt
    }
    result
  }

}
