/*Exercise 2.2
比較関数に従ってArray[A]がソートされているかを調べる関数を記述
def isSorted[A](as:Array[A], ordered:(A, A)=>Boolean):Boolean
*/

object Exercise2_2{
  def isSorted[A](as:Array[A], ordered:(A, A)=>Boolean):Boolean = {
    @annotation.tailrec
    def loop(n:Int):Boolean = {
      if(n >= as.length-1) true
      else if(ordered(as(n), as(n+1))) loop(n+1)
      else false
    }

    loop(0)
  }

  def isSorted2[A](as:Array[A], orderd:(A,A)=>Boolean):Boolean = {
    def loop(n:Int):Boolean = {
      if(n>=as.length) true
      else if(orderd(as(n-1), as(n))) loop(n+1)
      else false
    }

    loop(1)
  }

  def main(args:Array[String]):Unit = {
    println("Exercise 2.2")

    val as = Array[Int](1,2,3,4,5,6,7,8,9,10)
    val orderd = (a:Int, b:Int) => a<b
    val orderd2 = (a:Int, b:Int) => a>b

    var as2 = Array[Char]('d', 'c', 'b')
    val orderd21 = (a:Char, b:Char)  => a<b
    val orderd22 = (a:Char, b:Char) => a>b

    println("as1 isSorted 1:" + isSorted2(as, orderd)+" 2:" + isSorted(as, orderd2))
    println("as2 isSorted 1:" + isSorted2(as2, orderd21) + " 2:" + isSorted(as2, orderd22))
  }
}
