package yuan.scala.study.basics

/**
 * 泛型
 *
 */
trait Cache[K, V] {
	def get(key: K): V
	def put(key: K, value: V)
	def delete(key: K)
}

trait T{
	def remove[K](key: K)
}
