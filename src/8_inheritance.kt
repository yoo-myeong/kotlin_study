open class Dog {
    open var age : Int = 0

    open fun bark() {
        println("walwal")
    }
}

class Bulldog(override var age:Int = 0) : Dog() {
    final override fun bark() {
        println("kangkang")
    }
    // override된 것은 자동으로 open이 되기 때문에 한번 더 상속되는 것을 방지하기 위해서 final키워드를 지정해준다
}

//class ChildBulldog : Bulldog () {
//    override var age: Int = 0
//    override fun bark() {
//        super.bark()
//    }
//}

abstract class Developer {
    abstract  var age : Int
    abstract  fun code(lang : String)
}

class BackendDeveloper(override var age: Int = 0) : Developer() {
    override fun code(lang: String) {
        println("I code with $lang")
    }
}

fun main() {
    val dog = Bulldog(age = 2)
    println(dog.age)
    dog.bark()

    val developer = BackendDeveloper(age = 20)
    developer.code("kotlin")
}