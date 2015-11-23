package yuan.scala.study.basics

/**
 *
 * Created with IntelliJ IDEA.
 * User: yuanwei
 * Date: 2015.11.20 0020 16:52
 * To change this template use File | Settings | File Templates.
 */
class Hello {

	def values(): Unit ={
		//不可修改,常量
		val two = 1 + 1
		val three:Int=3
		println(two)
		println(three)
	}

	def variables():Unit={
		var name = "steve"
		name="name"

		var value:Int=10
		var str:String="str"
	}

	//function后面"="的花括号可以省略
	def addOne(m: Int): Int = m + 1
	def addTwo(m: Int): Int ={ m + 2 }

	def timesTwo(i:Int):Int={
		println(i)
		i * 2
		//返回值以最后一行表达式为准
		//在scala任何的函数、表达式、方法都有返回值（有些情况类似与java的void，所以scala创立了unit这个标识符来表示特殊的返回值）
	}

	def adds(m:Int,n:Int):Int={
		m+n
	}
	val addN=adds(1,_:Int)

	//柯里化函数
	//有时会有这样的需求：允许别人一会在你的函数上应用一些参数，然后又应用另外的一些参数。
	//例如一个乘法函数，在一个场景需要选择乘数，而另一个场景需要选择被乘数。
	def multiply(m: Int)(n: Int): Int = m * n
	//你可以直接传入两个参数。
	multiply(2)(3)
	//你可以填上第一个参数并且部分应用第二个参数。
	val timesTwo = multiply(2) _
	//你可以对任何多参数函数执行柯里化。例如之前的adder函数
	(adds _).curried

	//可变长度参数
	def capitalizeAll(args: String*) = {
		args.map { arg =>
			arg.capitalize
		}
	}
}
