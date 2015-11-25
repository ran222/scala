package yuan.scala.study

/**
 *
 * Created with IntelliJ IDEA.
 * User: yuanwei
 * Date: 2015.11.24 0024 17:31
 * To change this template use File | Settings | File Templates.
 */
object PatternMatchingAndFunctionalComposition {
	def f(s: String) = "f(" + s + ")"// (String)java.lang.String
	def g(s: String) = "g(" + s + ")"// (String)java.lang.String

	//compose 组合其他函数形成一个新的函数 f(g(x))
	//val fComposeG = f _ compose g _
	val fComposeG = f _ compose g
	//andThen 和 compose很像，但是调用顺序是先调用第一个函数，然后调用第二个，即g(f(x))
	val fAndThenG = f _ andThen g

	def main(args: Array[String]) {

		println("fComposeG(\"aa\"):"+fComposeG("aa"))
		println("fAndThenG(\"aa\"):"+fAndThenG("aa"))
	}
}
