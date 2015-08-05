/*Exercise2.1
末尾再帰関数を用いてフィナボッチ数を取得する関数を記述
def fin(n:Int):Int
*/

object Exercise2_1{

	def fib_not_tairec(n:Int):Int = {
		//@annotation.tailrec
		def go(n:Int):Int = {
			if(n<=0) 0
			else if(n==1) 1
			else go(n-1) + go(n-2)
		}
		go(n)
	}

	def fib(n:Int):Int = {
		@annotation.tailrec
		def go(m:Int, acc1:Int, acc2:Int):Int = {
			if(n == m) acc1
			else go(m+1, acc2, acc1+acc2)
		}
		go(0, 0, 1)
	}

	def fib2(n:Int):Int = {
		@annotation.tailrec
		def go(m:Int, acc1:Int, acc2:Int):Int = {
			if(n == m+1) acc2
			else go(m+1, acc2, acc1+acc2)
		}
		
		if(n == 0) 0
		else go(0, 0, 1)
	}

	def fib3(n:Int):Int = {
		@annotation.tailrec
		def go(n:Int, acc1:Int, acc2:Int):Int = {
			if(n <= 0) acc1
			else go(n-1, acc2, acc1+acc2)
		}

		go(n, 0, 1)
	}

	def main(args:Array[String]):Unit={
		println("Exercise 2.1")
		for(i <- 0 to 6){
			println("fib %d is %d.".format(i, fib3(i)))
		}
	}
}
