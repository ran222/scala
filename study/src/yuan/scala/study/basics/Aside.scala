package yuan.scala.study.basics

/**
 *
 * Created with IntelliJ IDEA.
 * User: yuanwei
 * Date: 2015.11.23 0023 10:22
 * To change this template use File | Settings | File Templates.
 */
class Aside {
	var acc = 0
	def minc = { acc += 1 }
	val finc = { () => acc += 1 }

	def main(args: Array[String]) {
		val c = new Aside()
		c.minc // calls c.minc()
		c.finc // returns the function as a value:
	}
}
