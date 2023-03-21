package com

fun main() {
    println()
}

//return 하는 여러 방법

fun sum(a: Int, b: Int) =  a + b

fun sum2(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int):Unit {
    println("sum of $a and $b is ${a + b}")
}

// 함수 매개변수는 해당 인수를 건너뛸 때 사용되는 기본값을 가질 수 있다. 또한 이것은 과부하의 수를 줄여줌
fun read(
    b: ByteArray,
    off: Int = 0,
    len: Int = b.size,
) { /*...*/ }

// 클래스 사용방법
class Function {

}

// 접근 제어를 open 으로 하면 상속 가능 하게 함
open class A {
    open fun foo(i: Int = 10) {}
}

class B : A() {
    override fun foo(i: Int) {/*...*/ }  // 기본값은 사용  x
}