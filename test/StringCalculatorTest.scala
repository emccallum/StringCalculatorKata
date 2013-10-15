import java.io.PrintStream
import org.specs2.matcher.ShouldMatchers
import org.specs2.mock.Mockito
import org.specs2.mutable._

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworks
 * Date: 10/15/13
 * Time: 2:19 PM
 * To change this template use File | Settings | File Templates.
 */
class StringCalculatorTest extends Specification with ShouldMatchers {
  val stringCalculator = new StringCalculator

  "The add method" should {
    "return the sum of zero numbers as 0" in {
      val result: Int = stringCalculator.add("")
      result mustEqual 0
    }
    "return one number if the string has one number" in {
      val result: Int = stringCalculator.add("1")
      result mustEqual 1
    }
    "return the sum of two numbers if the string has two numbers" in {
      val result: Int = stringCalculator.add("1,2")
      result mustEqual 3
    }
    "return the sum of multiple numbers if the string has multiple numbers" in {
      val result: Int = stringCalculator.add("1,2,3,4,5")
      result mustEqual 15
    }
  }

}
