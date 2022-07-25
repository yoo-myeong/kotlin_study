fun main() {
    try{
        Thread.sleep(1)
    }catch (e : Exception) {
        println("Error occur!")
    } finally {
        println("finally occur!")
    }

    // 코틀린에서 try catch는 표현식이기 때문에 값 전달이 가능
    val a = try {
        "1234".toInt()
    }catch (e: Exception) {
        println("예외 발생!")
    }
    println(a)

//    throw Exception("예외 발생")

    val b : String? = null
    val c : String = b?: failFast("b is null")
    // 앨비스 연산자와 Nothing타입을 같이 사용하면 c는 절대 null이 될 수 없음

    println(c?.length)

}


fun failFast(msg : String):Nothing {
    throw IllegalArgumentException(msg)
}