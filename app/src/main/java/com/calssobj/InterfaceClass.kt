package com.calssobj

fun main(){
    println(InterfaceClass().foo())
}

class InterfaceClass :MyInterface{
    override val prop: Int = 29
    override val propertyWithImplementation: String = ""


    override fun foo() {
        println(propertyWithImplementation)
    }
}

interface MyInterface {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(propertyWithImplementation)
    }
}


// abstract로 정의한 추상 클래스이다. 주생성자를 사용했다.
abstract class Vehicle(val name : String, val color : String, val weight : Double) {
    // abstract로 정의한 추상 프로퍼티이므로 하위 클래스에서 반드시 재정의해야한다.
    abstract var maxSpeed : Double

    // 초기값을 갖는 일반 프로퍼티 (인터페이스에서는 불가능)
    var year = "2021"

    // abstract로 정의한 추상 메소드이므로 하위 클래스에서 반드시 재정의해야한다.
    abstract fun start()
    abstract fun stop()

    fun displaySpecs() {
        println("Name : $name, Color : $color, Weight : $weight, Year : $year, MaxSpeed : $maxSpeed")
    }
}


