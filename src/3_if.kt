fun main() {
    val job = "sw"

    if(job == "sw") println("개발자")
    else print("논개발자")

    // 코틀린에서 if는 식(값을 반환)으로 사용가능
    // 자바에서는 if가 구문이라서 값을 반환하지 않음
    val str = if(job == "sw") "개발자" else "논개발자"
    // 때문에 if문 자체가 표현식이 되기에 삼항연산가 불필요해서 코틀린에선 삼항연산자가 없음
}