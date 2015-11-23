package yuan.scala.study.basics

/**
 *
 * Created with IntelliJ IDEA.
 * User: yuanwei
 * Date: 2015.11.23 0023 10:50
 * To change this template use File | Settings | File Templates.
 */
abstract class Shape {
	def getArea():Int    // subclass should define this

	def main(args: Array[String]) {
		val c = new Circle(2)
		println(c.getArea())
	}
}
class Circle(r: Int) extends Shape {
   def getArea():Int = { r * r * 3 }
}
