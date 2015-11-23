package yuan.scala.study.basics

/**
 *
 * Created with IntelliJ IDEA.
 * User: yuanwei
 * Date: 2015.11.23 0023 10:28
 * To change this template use File | Settings | File Templates.
 */
class EvenMoreScientificCalculator(brand: String) extends ScientificCalculator(brand) {
	def log(m: Int): Double = log(m, math.exp(1))
}
