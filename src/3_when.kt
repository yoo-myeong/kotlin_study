fun main() {
    val day = 2

    val result = when(day) {
        1-> "월요일"
        2-> "화요일"
        3-> "수요일"
        else -> "기타"
    }

    println(result)

    when(getColor()){
        Color.RED -> println("red")
        Color.GREEN -> println("green")
    }

    // 여러개의 조건을 콤마로 구분해 한줄에서 정의할 수 있다.
    when(getNumber()){
        0, 1 -> print("0 or 1")
        else -> print("2이상")
    }
}

enum class Color {
    RED, GREEN
}

fun getColor() = Color.RED
fun getNumber() = 2