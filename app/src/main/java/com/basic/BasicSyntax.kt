package com.basic

/* 기본 적이지만 코틀린의 진입점은 main함수
*  기본적이지도 않다 코틀린에선 class안에 들어가 있지도 않은데 어떻게 main함수가 실행 될까?
*  해당 질문은 코틀린 컴파일러 과정을 알야함
*  수코틀린은 jvm위에서 실행되는데 이 때 , main( ) 함수에 있는 파일 이름을 기준으로 자바 클래스가 자동 생성된다.
*  역컴파일 해보면 알수 있다?
* */


fun main(){
    BasicSyntax.main()
}


class BasicSyntax {

    /*
    * 만약 클래스를 따로 선언하고 정적 함수나 변수를 사용하고 싶다면 "companion object"를 사용하면 된다.
    * */
    companion object{
        fun main(){
            println("안녕 세상아")
        }
    }


}