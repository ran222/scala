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
		//不可修改
		val two = 1 + 1
		val three:Int=3
		println(two)
		println(three)
	}

	values()
}
