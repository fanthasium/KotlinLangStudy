package com.calssobj

import android.content.Context
import android.util.AttributeSet
import android.view.View

fun main() {

    println(Derived("Asd", "asda"))
}

// 가시성 수정자(접근 제한자) 가 있거나 어노테이션이 있을 땐 constructor를 넣어줘야 함
internal class BasicClass constructor(name: String) {
    private val customerKey = name.uppercase()

    init {
        println(customerKey)
    }

}

// 주생성자에는 protected 사용이 안됨 논리적 흐름에 맞지않음 따라서 보조 생성자에는 가능함
class Person(val name: String, val age: Int = 25) {

    val children: MutableList<Person> = mutableListOf()

    constructor(name: String, parent: Person) : this(name) {
        parent.children.add(this)
    }
}

//추상 클래스
abstract class Polygon {
    abstract fun draw()
}

open class Rectangle : Polygon() {
    override fun draw() {
        // draw the rectangle
    }
}


class FilledRectangle: Rectangle() {
    override fun draw() {
        val filler = Filler()
        filler.drawAndFill()
    }

    inner class Filler {
        fun fill() { println("Filling") }
        fun drawAndFill() {
            super@FilledRectangle.draw() // Calls Rectangle's implementation of draw()
            fill()
            println("Drawn a filled rectangle with color ${super@FilledRectangle.toString()}") // Uses Rectangle's implementation of borderColor's get()
        }
    }

}

annotation class Test(){
    companion object{
        const val c: Int = 0
    }
}

/* 실행 시켜보면 파생 클래스의 새 인스턴스를 생성하는 동안 기본 클래스 초기화가 첫 번째 단계로 수행됩니다
   초기화 전에 Derived class에서 생성자로 보내주는 값이 먼저실행됨다
   */


open class Base(val name: String) {


    init {
        println("Initializing a base class")
    }

    open val size: Int =
        name.length.also { println("Initializing size in the base class: $it") }
}


class Derived(
    name: String,
    val lastName: String,
) : Base(name.replaceFirstChar { it.uppercase() }
    .also { println("Argument for the base class: $it") }) {

    init {
        println("Initializing a derived class")
    }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in the derived class: $it") }
}

