package com.basic

fun main(){

    val str = ""
    if(str is String) println("good")

    if(str !is String ) println("not good")
    else println("good")
}

class TypeCheckAndCasts {
}