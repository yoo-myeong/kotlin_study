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
    val c = b?: failFast("b is null")

    println(c?.length)

}


fun failFast(msg : String):Nothing {
    throw IllegalArgumentException(msg)
}