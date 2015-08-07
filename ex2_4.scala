/*Exercise 2.4
 * curry化の逆を行うuncurryを実装
 * def uncurry[A, B, C](f:A => B => C): (A, B) => C
 */

object Exercise2_4{
  def uncurry[A, B, C](f:A => B => C): (A, B) => C = {
    (a:A, b:B) => f(a)(b)
  }

  def main(args:Array[String]){
    println("Exercise 2.4")
    val fc = (a:Int) => (b:Int) => a+b
    val f = uncurry(fc)
    println("Original:fc(1)(2) = " + fc(1)(2))
    println("UnCurry:f(1, 2) = " + f(1, 2))
  }
}
