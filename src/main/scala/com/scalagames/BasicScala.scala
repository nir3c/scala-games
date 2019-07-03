package com.scalagames


object BasicScala {

  def main(args: Array[String]): Unit ={
    val stringWithoutBackslash = """c:\1"""
    println(stringWithoutBackslash)
    val lambdaMethod = () => print("method executed")
    println(lambdaMethod)
    val `more readable variable` = "more readable variable"
    println(`more readable variable`)
    val `return value method` = return_value_method
    println(`return value method`)
    annonimousMethodExecution
    new ClassConstructorAsScript
    testEqualityExample
    convertType
    testMethodWithDefaultParameters
    `java last parameter 3 dots method`(1,2,3,4)
    val classWithOneParameterMethod = new ClassWithOneParameterMethod
    classWithOneParameterMethod oneParameterMethod 1
    LikeJavaMethodsInClass.staticMethod
  }

  def return_value_method(): Int ={
    if (1==1) 5
    else 6
  }

  def annonimousMethodExecution(): Unit ={
    val annonimousMethodExecution = {
      val radius = 20
      val pi = java.lang.Math.PI
      2*pi*radius
    }
    println(annonimousMethodExecution)
  }

  class ClassConstructorAsScript{
    println("Hello from ClassConstractorAsScript")
    val arg = 2
    println(s"val arg=$arg")
  }

  def testEqualityExample(): Unit = {
    val equalsByValue = new EqualityExample == new EqualityExample
    println(s"equals by value: $equalsByValue")
    val equalsByReference = new EqualityExample eq new EqualityExample
    println(s"equals by reference: $equalsByReference")
  }

  def convertType(): Unit = {
    val someDouble = 3.0
    // prints false
    println(someDouble.isInstanceOf[Long])
    val converted = someDouble.asInstanceOf[Long]
    // prints true
    println(converted.isInstanceOf[Long])
  }

  def testMethodWithDefaultParameters(): Unit ={
    methodWithDefaultParameters() // execute x = 5 y = 5
    methodWithDefaultParameters2(3) // execute x = 3 y = 5
    methodWithDefaultParameters3(y = 3) // execute x = 5 y = 3
  }

  def methodWithDefaultParameters(x: Int = 5, y: Int = 5): Unit ={}
  def methodWithDefaultParameters2(x: Int, y: Int = 5): Unit ={}
  def methodWithDefaultParameters3(x: Int = 5, y: Int): Unit ={}

  def `java last parameter 3 dots method`(x: Int*): Unit ={
    x.foreach(n => println(n))
  }

  class EqualityExample

  class OverrideExample {
    override def toString = "to string OverrideExample"
  }

  class ClassPrimaryConstructor(val readOnlyVal : Int, var readAndWriteVar : Int)

  class ClassPublicPrivateMembers(private val privateVal : Int, val publicVal : Int)

  class ClassOverloadingConstructor(val readOnlyVal : Int, var readAndWriteVar : Int){
    def this(readOnlyVal : Int){
      this(readOnlyVal, 6)
    }
  }

  class ClassWithDefaultMember{
    var member : Int = _
  }

  class ClassWithOneParameterMethod {

    def oneParameterMethod(x: Int): Unit = {
      val expected_true = x + 1 == x.+(1)
      println(expected_true)
    }
  }

  object LikeJavaMethodsInClass {

    def staticMethod: Unit = {
      println("staticMethod")
    }

  }

}
