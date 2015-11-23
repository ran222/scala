package yuan.scala.study.basics

/**
 *
 * Created with IntelliJ IDEA.
 * User: yuanwei
 * Date: 2015.11.23 0023 10:54
 * To change this template use File | Settings | File Templates.
 */
trait Traits {
	//什么时候应该使用特质而不是抽象类？ 如果你想定义一个类似接口的类型，你可能会在特质和抽象类之间难以取舍。这两种形式都可以让你定义一个类型的一些行为，并要求继承者定义一些其他行为。一些经验法则：

	//优先使用特质。一个类扩展多个特质是很方便的，但却只能扩展一个抽象类。
	//如果你需要构造函数参数，使用抽象类。因为抽象类可以定义带参数的构造函数，而特质不行。例如，你不能说trait t(i: Int) {}，参数i是非法的。

}

trait Car {
	val brand: String
}

trait Shiny {
	val shineRefraction: Int
}

class BMW extends Car {
	val brand = "BMW"
}

class BMW12 extends Car with Shiny {
	val brand = "BMW"
	val shineRefraction = 12
}
