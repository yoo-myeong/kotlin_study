class Product(val name : String, val price: Int)

interface Wheel {
    fun roll()
}

interface Order {
    fun add(product : Product) {
        println("order successed")
    }

    fun printId() = "order printId"
}

interface Cart :Wheel {
    val weight : String
        get() = "28Kg"
    // 인터페이스서는 filed 사용 불가

    var coin : Int
    fun add(product : Product)
    fun rent(){
        if(coin > 0) {
            println("rented cart")
        }
    }

    fun printId() = "Cart printId"

    override fun roll() {
        println("rolling cart")
    }
}

class MyCart(override var coin : Int) : Cart, Order {
    override fun add (product: Product){
        if(coin <= 0) println("put coin")
        else println("added cart")
        
        super<Order>.add(product)
        // 동일메서드는 super로 호출
    }

    override fun printId(): String {
        // 상위클래스에서 동일메서드를 정의하고 있는 경우 하위클래스에서는 구체적으로 명시해주는 override를 작성해주어야 함함
       return super<Cart>.printId()
    }
}

fun main() {
    val cart = MyCart(100)
    cart.add(Product("toy", 1000))
}