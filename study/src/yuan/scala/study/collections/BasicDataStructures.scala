package yuan.scala.study.collections

/**
 *
 * Created with IntelliJ IDEA.
 * User: yuanwei
 * Date: 2015.11.23 0023 16:22
 * To change this template use File | Settings | File Templates.
 */
object BasicDataStructures {
	val lists = List(1, 2, 3, 4)
	val sets= Set(1, 1, 2)

	//Tuple 元组是在不使用类的前提下，将元素组合起来形成简单的逻辑集合。
	val host=("127.0.0.1",8000)
	//与样本类不同，元组不能通过名称获取字段，而是使用位置下标来读取对象；而且这个下标基于1，而不是基于0。
	// hostPort._1 127.0.0.1
	// hostPort._2 8000
	/*host match {
		case ("localhost", port) => ...
		case (host, port) => ...
	}*/

	def main(args: Array[String]) {

	}
}

class Maps{
	val aMap=Map(1->2)
	val bMap=Map("one"->1,"two"->2)
}
