fun sum(a:Int, b:Int) : Int {
    return a+b
}

fun sum2(a:Int, b:Int) : Int = a+b

fun sum3(a:Int, b:Int) = a+b

// 블록이 있는 함수는 반환타입을 생략하면 오류 발생
//fun sum4(a:Int, b:Int)  {
//    return a+b
//}

// 반환 타입이 없는 함수는 Unit을 반환 자바에서의 void라고 볼수 있음

// 디폴트 파라미터를 선언해줄 수 있음
fun greeting(name:String = "there", msg:String = "Hi!") {
    println("$name, $msg")
}

fun main() {
    greeting()
    greeting("seon","Nice to meet ya!")

    // 코틀린은 argument parameter 사용할 수 있음
    greeting(msg = "haluhalu", name = "myeong")
}