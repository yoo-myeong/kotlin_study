fun main() {
//    val a : String = null
//    val b : String = "annb"
//    b= null

    // 코틀린에서 제공하는 nullable 타입
    var a : String? = null
//    a.length
    // nullable한 타입의 접근은 안전연산로 해결함
    println(a?.length)
    // 출력하면 null이 출력됨

    val b :Int = if(a !== null) a.length else 0
    println(b)
    // ===
    val c = a?.length ?: 0
    // 엘비스연산자 : 좌변이 null이면 우변을 반환

    val nullableStr = getNullStr()
    val nullableStrLength = nullableStr?.length
    println(nullableStrLength)

    val length = getLengthIfNotNull(null)
    println(length)

//    throw NullPointerException()

    // 단언연산자 -> null이 발생하지 않는 안전한 코드다 라고 명시
    val d :String? = null
    val e= d!!.length
}

fun getNullStr():String? = null
fun getLengthIfNotNull(str:String?) = str?.length ?: 0
