package yuan.scala.study.basics2


/**
 *
 * Created with IntelliJ IDEA.
 * User: yuanwei
 * Date: 2015.11.23 0023 14:29
 * To change this template use File | Settings | File Templates.
 */
object PatternMatching {

	def matchTimes(times:Int):String={
		times match {
			case 1 => "one"
			case 2 => "two"
			case _ => "some other number"
		}
	}

	def match2(times:Int):String={
		times match {
			case i if i == 1 => "one"
			case i if i == 2 => "two"
			case _ => "some other number"
		}
	}

	def bigger(o: Any): Any = {
		o match {
			case i: Int if i < 0 => i - 1
			case i: Int => i + 1
			case d: Double if d < 0.0 => d - 0.1
			case d: Double => d + 0.1
			case text: String => text + "s"
		}
	}



	def calcType(calc: Calculator) = calc match {
		case _ if calc.brand == "HP" && calc.model == "20B" => "financial"
		case _ if calc.brand == "HP" && calc.model == "48G" => "scientific"
		case _ if calc.brand == "HP" && calc.model == "30B" => "business"
		case _ => "unknown"
	}

	def caseType(calc: Calculator) = calc match {
		case Calculator("hp", "20B") => "financial"
		case Calculator("hp", "48G") => "scientific"
		case Calculator("hp", "30B") => "business"
		case Calculator(ourBrand, ourModel) => "Calculator: %s %s is of unknown type".format(ourBrand, ourModel)
	}

	def main(args: Array[String]) {
		println("the color is: " + colorHolder.BLUE)
		println(matchTimes(1))
		println(matchTimes(3))
		println(bigger(-1))
		println(bigger(1))
		println(bigger(-1.0D))
		println(bigger(1.0D))
		println(bigger("text"))





	}
}

case class Calculator(brand: String, model: String)
//class Calculator(brand:String,model:String){}
