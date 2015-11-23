package yuan.scala.study.basics2

/**
 *
 * 单例对象用于持有一个类的唯一实例。通常用于工厂模式。
 */
object Objects {
	def main(args: Array[String]) {
		Timer.currentCount()
		Timer.currentCount()
		Timer.currentCount()

	}
}
object Timer {
	var count = 0

	def currentCount(): Long = {
		count += 1
		count
	}
}


/*class Bar(foo: String){
	object Bar {
		def apply(foo: String) = new Bar(foo)
	}
}*/


object colorHolder {
	val BLUE = "Blue"
	val RED = "Red"
}