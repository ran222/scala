package yuan.scala.study

/**
  * Created by yuan on 11/26 0026.
  */
object AdvancedTypes {
  def main(args: Array[String]) {
    //隐 函数允许类型自动转换。更确切地说，在隐式函数可以帮助满足类型推断时，它们允许按需的函数应用
    implicit def strToInt(x: String) = x.toInt

    val y: Int = "123"
    println(math.max("123", 111))


  }
}

//视界，就像类型边界，要求对给定的类型存在这样一个函数。您可以使用<%指定类型限制
class Container[A <% Int] { def addIt(x: A) = 123 + x }
