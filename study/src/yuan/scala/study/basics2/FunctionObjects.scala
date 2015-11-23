package yuan.scala.study.basics2

/**
 *
 * Created with IntelliJ IDEA.
 * User: yuanwei
 * Date: 2015.11.23 0023 12:02
 * To change this template use File | Settings | File Templates.
 */
class FunctionObjects {

}

//函数即对象
//函数是一些特质的集合。具体来说，具有一个参数的函数是Function1特质的一个实例。
//这个特征定义了apply()语法糖，让你调用一个对象时就像你在调用一个函数。
//extends (Int => Int)代替extends Function1[Int, Int]
object addOne extends Function1[Int, Int] {
	def apply(m: Int): Int = m + 1
}
//addOne(1)