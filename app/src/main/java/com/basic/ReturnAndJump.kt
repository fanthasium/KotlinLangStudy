package com.basic


data class person(val name : String)

fun main(){

}

//레이블
//시간초 계산도 낫베드
fun labelLoop(){
    loop@ for (i in 0..100) {
        for (j in 1..100) {
            println("$i $j")
            if (j < i){
                println("$i $j")
                break@loop
            }
        }
    }
}
/*

val s = person.name ?: throw IllegalArgumentException("Name required")

위에 exception코드를 아래로 바꿀 수 있고

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

위 코드를

val s = person.name ?: fail("Name required")
println(s)     // 's' is known to be initialized at this point

로 변경가능
*/


// 반환값이 3까지 가서 끝나냐 3을 넘기고 진행되냐로 달라진다
fun lamdaFunc(){
    listOf(1,2,3,4,5).forEach lit@{
        if(it == 3) return@lit // 람다식 implict label은 명시적 forEach@는 묵시적
        println(it)
    }
    println("Done With implicit label")
}

fun anymouseFunc() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return  // 익명함수(forEach loop)에 대한 local return
        print(value)
    })
    print("익명함수를 사용한 코드")
}