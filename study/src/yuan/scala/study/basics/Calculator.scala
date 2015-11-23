package yuan.scala.study.basics

/**
 *
 * Created with IntelliJ IDEA.
 * User: yuanwei
 * Date: 2015.11.23 0023 10:17
 * To change this template use File | Settings | File Templates.
 */
class Calculator(brand:String) {
	//val brand:String=brand
	//val model:String

	/**
	 * A constructor.
	 */
	val color: String = if (brand == "TI") {
		"blue"
	} else if (brand == "HP") {
		"black"
	} else {
		"white"
	}




	// An instance method.
	def add(m: Int, n: Int): Int = m + n
}
