package yuan.scala.study.basics

/**
 *
 * Created with IntelliJ IDEA.
 * User: yuanwei
 * Date: 2015.11.23 0023 10:27
 * To change this template use File | Settings | File Templates.
 */
class ScientificCalculator(brand: String) extends Calculator(brand) {
	def log(m: Double, base: Double) = math.log(m) / math.log(base)
}
