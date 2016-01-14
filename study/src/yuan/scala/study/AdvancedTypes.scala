package yuan.scala.study

/**
  * Created by yuan on 11/26 0026.
  */
object AdvancedTypes {
  def main(args: Array[String]) {
    //隐 函数允许类型自动转换。更确切地说，在隐式函数可以帮助满足类型推断时，它们允许按需的函数应用
    implicit def strToInt(x: String): Int = x.toInt

    val y: Int = "123"
    println(y)
    println(math.max("123", 111))
    //这是说 A 必须“可被视”为 Int ,其他类型不行
    println( new Container[String].addIt("123") )
    println( new Container[Int].addIt(123)  )
    //println( new Container[Float].addIt(123.2F) ) //编译出错



    /*min的源码
    def min[B >: A](implicit cmp: Ordering[B]): A = {
      if (isEmpty)
        throw new UnsupportedOperationException("empty.min")

      reduceLeft((x, y) => if (cmp.lteq(x, y)) x else y)
    }*/
    println("List(1,2,3,4).min :",List(1,2,3,4).min)

    println("自定义排序 :"+List(1,2,3,4).min(new Ordering[Int] { def compare(a: Int, b: Int) = b compare a }))
  }

}

//视界，就像类型边界，要求对给定的类型存在这样一个函数。您可以使用<%指定类型限制
class Container[A <% Int] { def addIt(x: A) = 123 + x }
