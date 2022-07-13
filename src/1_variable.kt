fun main() {
    // 타입 추론
    val a : Int = 1
    val b = 1

    //지연 할당
    val c : Int
    c = 3

    // 타입 지정해주지 않으면 지연 할당을 할 수 없음
//    val d
//    d = 5

    // val : value, JS의 const
    // var : variable, JS의 let
    // 다만, JS의 const는 지연할당이 불가능하지만 val은 지연할당이 가능한 것이 차이점

    var str : String = "hello"
//    a = 1
    // 변수의 타입이 한번 정해지면 바꿀 수 없음
}