/**
 *  Copyright (C) 2009-2011 Typesafe Inc. <http://www.typesafe.com>
 */

package akka.rk
package buh.is.it

trait X

/**
 * class A
 */
class A {
  /**
   * def p(x: Array[Int]): Predef.type
   */
  def p(x: Array[Int]) = Predef

  /**
   * def params[T <: B](b: T): T
   */
  def params[T >: D <: B](b: T): List[T] = b :: Nil

  /**
   * extra comment
   */

  /**
   * class A.B
   */
  // one line comment
  class B extends X {
    /**
     * secondary constructor
     */
    def this(s: String) = this()
    /**
     * def b(args: String*): Unit
     */
    def b(args: String*) {
      /**
       * new AnyRef {}
       */
      new AnyRef {
        /**
         * def x: Int
         */
        def x = 2
      }
    }
    def d(a: String)(b: X) = ""
  }
  
  class C extends { val i = 1 } with X
  class D extends { val i = 1 } with B
}

/**
 * object A
 */
object A {
  /**
   * def IAmStatic: Int
   */
  def IAmStatic = 42
  /**
   * val stattic: String
   */
  val stattic = "1"
  /**
   * static p
   */
  def p = "i am not forwarded"
    
  private object NoComment
  
  /**
   * a non-comment
   */
  p
  val x = new AnyRef
}