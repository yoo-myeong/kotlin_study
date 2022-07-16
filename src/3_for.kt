fun main() {
    // 범위 연산자 ".."
    for (i in 0..3) {
        println(i)
    }

    // until
    for (i in 0 until 3){
        println(i)
    }

    // step
    for (i in 0 .. 6 step 2) {
        println(i)
    }

    // downto
    for (i in 3 downTo 1) {
        println(i)
    }

    // 배열 반복
    val numbers = arrayOf(1,2,3)
    for (i in numbers) {
        println(i)
    }

    // while
    var x = 5
    while (x > 0) {
        println(x)
        x--
    }
}