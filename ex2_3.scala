/*Exercise 2.3
 * カリー化を行う関数の実装
 * def curry[A,B,C](f:(A, B)=>C):A => (B=>C)
 */

object Exercise2_3{
  def curry[A, B, C](f:(A, B) => C):A => (B => C) = {
    (a:A) => (b:B) => f(a, b)
  }

  def main(args:Array[String]):Unit = {
    println("Exercise 2.3")

    val f = (a:Int, b:Int) => a+b
    val fc = curry(f)
    println("1 + 2 = " + fc(1)(2))
    //println("1 + 2 = " + f(1)(2)) This sentence is error.
  }
}
