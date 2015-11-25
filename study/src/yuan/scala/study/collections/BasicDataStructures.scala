package yuan.scala.study.collections

/**
 *
 * Created with IntelliJ IDEA.
 * User: yuanwei
 * Date: 2015.11.23 0023 16:22
 * To change this template use File | Settings | File Templates.
 */
object BasicDataStructures {
	val numbers = List(1, 2, 3, 4)
	val lists1 = List(4,5,6)
	val sets= Set(1, 1, 2)



	val aMap=Map(1->2)
	val bMap=Map("one"->1,"two"->2)

	//Tuple 元组是在不使用类的前提下，将元素组合起来形成简单的逻辑集合。
	val host=("127.0.0.1",8000)
	//与样本类不同，元组不能通过名称获取字段，而是使用位置下标来读取对象；而且这个下标基于1，而不是基于0。
	// hostPort._1 127.0.0.1
	// hostPort._2 8000
	/*host match {
		case ("localhost", port) => ...
		case (host, port) => ...
	}*/

	/** 函数组合子（Functional Combinators） */
	//List(1, 2, 3) map squared
	// 对列表中的每一个元素都应用了squared平方函数，并返回一个新的列表List(1, 4, 9)。我们称这个操作map 组合子。
	// （如果想要更好的定义，你可能会喜欢Stackoverflow上对组合子的说明。）他们常被用在标准的数据结构上。
	//  http://stackoverflow.com/questions/7533837/explanation-of-combinators-for-the-working-man
	def fn(): Unit ={
		var list=numbers.map( (i:Int)=>i * 10 )//返回新的list
		printList("numbers.map( (i:Int)=>i * 10 )",list)
		//numbers.map(timesTwo _)
		//numbers.map(timesTwo(_))
		list=numbers.map(timesTwo)//返回 list
		printList("numbers.map(timesTwo)",list)

		//foreach 很像map，但没有返回值。foreach仅用于有副作用[side-effects]的函数。
		numbers.foreach((i:Int)=> i*2)//无返回值
		numbers.foreach((i:Int)=> {i*2})//无返回值
		//numbers.foreach((i:Int)=> println(i) )//无返回值
		numbers.foreach((i:Int)=> {
			//println(i)
		})//无返回值

		//filter 移除任何对传入函数计算结果为false的元素。返回一个布尔值的函数通常被称为谓词函数[或判定函数]。
		list=numbers.filter((i: Int) => i % 2 == 0)//返回新的list
		printList("numbers.filter((i: Int) => i % 2 == 0)",list)

		list=numbers.filter(isEven)//返回新的list
		printList("numbers.filter(isEven)",list)

		//zip将两个列表的内容聚合到一个对偶列表中。
		List(1, 2, 3).zip(List("a", "b", "c"))
		//List[(Int, String)] = List((1,a), (2,b), (3,c))

		//partition将使用给定的谓词函数分割列表。
		List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).partition((i:Int)=>i%2==0)
		//(List[Int], List[Int]) = (List(2, 4, 6, 8, 10),List(1, 3, 5, 7, 9))

		//find返回集合中第一个匹配谓词函数的元素。
		val op = numbers.find((i: Int) => i % 3 == 0) //Option[Int] = Some(3)
		println("numbers.find((i:Int)=>i%3==0):"+op)

		//drop 将删除前i个元素
		//val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
		list=List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).drop(5)// List[Int] = List(6, 7, 8, 9, 10)
		printList("List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).drop(5)",list)

		//dropWhile 将删除元素直到找到第一个匹配谓词函数的元素。第一个元素不匹配就不删除(坑)
		// 例如，如果我们在numbers列表上使用dropWhile奇数的函数, 1将被丢弃（但3不会被丢弃，因为他被2“保护”了）。
		list=List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).dropWhile(_ % 2 != 0)
		printList("List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).dropWhile(_ % 2 != 0)",list)

		list=List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).dropWhile( _ >=3)
		printList("List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).dropWhile(_>=3)",list)
		//printList("",list)
		//List[Int] = List(2, 3, 4, 5, 6, 7, 8, 9, 10)

		//0为初始值（记住numbers是List[Int]类型），m作为一个累加器。
		println("numbers.foldLeft(0):")
		numbers.foldLeft(0) { (m: Int, n: Int) => println("m: " + m + " n: " + n); m + n }
		println("numbers.foldRight(0):")
		numbers.foldRight(0) { (m: Int, n: Int) => println("m: " + m + " n: " + n); m + n }

		//flatten将嵌套结构扁平化为一个层次的集合。
		printList("List(List(1, 2,3), List(3, 4)).flatten",List(List(1, 2), List(3, 4)).flatten)//List[Int] = List(1, 2, 3, 4)

		val nestedNumbers = List(List(1, 2), List(3, 4))//List[List[Int]] = List(List(1, 2), List(3, 4))
		list=nestedNumbers.flatMap(x => x.map(_ * 2))
		printList("List(List(1, 2), List(3, 4)).flatMap(x => x.map(_ * 2))",list)
		//可以把它看做是“先映射后扁平化”的快捷操作：
		//nestedNumbers.map((x: List[Int]) => x.map(_ * 2)).flatten


	}

	def mapFn(): Unit ={
		val extensions = Map("steve" -> 100, "bob" -> 101, "joe" -> 201)
		// scala.collection.immutable.Map[String,Int] = Map((steve,100), (bob,101), (joe,201))
		//现在筛选出电话分机号码低于200的条目。
		extensions.filter((namePhone: (String, Int)) => namePhone._2 < 200)
		// scala.collection.immutable.Map[String,Int] = Map((steve,100), (bob,101))
		extensions.filter({case (name, extension) => extension < 200})
		// scala.collection.immutable.Map[String,Int] = Map((steve,100), (bob,101))

	}


	def timesTwo(i: Int): Int = i * 2
	def isEven(i: Int): Boolean = i % 2 == 0

	def printList(str:String,list: List[Any]):Unit={
		print(str+":")
		list.foreach((i:Any)=>print(i+" ") )
		println()
	}


	def main(args: Array[String]) {
		//:::,合并两个列表
		var list3 = numbers::: lists1
		list3.foreach((li: Int) => print(li + " ") )
		println()

		//::,在列表的开头添加进某个元素
		list3 = 0:: lists1
		list3.foreach((i: Int) => print(i + " ") )

		fn()

		mapFn()

		println(bMap.get("two"))//get出来的是option
		println(bMap.get("three"))
		println(bMap.get("three").isDefined)
		println(bMap.get("three").isEmpty)
		println(bMap.getOrElse("three", 0))



	}
}
