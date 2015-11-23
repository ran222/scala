package yuan.scala.study.basics2

/**
 *
 * Created with IntelliJ IDEA.
 * User: yuanwei
 * Date: 2015.11.23 0023 11:57
 * To change this template use File | Settings | File Templates.
 */
class ApplyMethods {
}

class Foo {}

object FooMaker {
	def apply() = new Foo
}

class Bar {
	def apply() = 0
}
// val bar = new Bar
// bar()


