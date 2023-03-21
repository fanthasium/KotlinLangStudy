package com.basic

class ConditionalExpression {
}

fun main(args: Array<String>){
    println(loop())
   /* whenCaluse()*/

}

//조건식은 이렇게 사용이 가능함
fun c(a: Int = 1, b: Int = 2) = if(a > b) a else b

fun conditionalIf(){
    val a = 0
    val b = 2
    val maxLimit = 1
    val maxOrLimit = if (maxLimit > a) maxLimit else if (a > b) a else b
    println(maxOrLimit)

}




//for문은 이렇게 사용
fun loop(){
    val items = listOf("apple", "orange", "kiwifruit")

    //*****************    확장함수   *********************************
    /*iterable에 대한 반복을 돌리면서 각원소에 대해 입력받은 값으로 action을 수행하도록 만듦*/

/*
    items.forEachIndexed { index, s ->
        println(index)
        println(s)
    }

    items.forEach{
        println(it)
    }
*/

    //******************************************************************

    for (item: String in items) {
        println(item.withIndex().find {
            it.index == items.indexOf("apple")
        })

        //결과는 apple의 인덱스 1값을 char의 요소 1로 가져옴
    }

    // index와 값을 둘다 나타내줌
    for (item in items) {
        println(item.indices.find { items[it] == item})
        println(item)
    }

    for ((index, value) in items.withIndex()) {
        println("the element at $index is $value")
    }
}

// when절은 이렇게 사용

/*fun whenCaluse1(): String {
    val items = listOf("kiwifruit",0)
   val c = when {
        1 in items -> "숫잔뎅"
        "kiwifruit" !in items -> "문잔뎅"
       else ->  return "뭐 없는뎅"
   }
    return c
}

fun Request.getBody() =
    when (val response = executeRequest()) {
        is Success -> response.body
        is HttpError -> throw HttpException(response.status)
    }*/

