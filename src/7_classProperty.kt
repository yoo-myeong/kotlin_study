class Coffee(
    var name : String = "",
    var price : Int = 0,
    val hotOrIce : String,
    // var로 선언하면 getter, setter 가 만들어지고
    // val은 getter만 만들어짐
) {
    val brand : String
        get() {
            return "스타벅스"
        }

    var quantity : Int = 0
        set(value) {
            if(value > 0) {
                field = value
            }
        }
}

class EmptyClass

fun main() {
    val coffee = Coffee(hotOrIce= "hot")
    coffee.name = "아이스아메리카노"
    coffee.price = 2000

    coffee.quantity = -1

    println(coffee.brand)
    println(coffee.quantity)
}