package _2

class Person(val name:String, val age:Int)
data class PersonData(val name:String, val age:Int)

fun main() {
    val person1 = Person(name = "tony", age = 12)
    val person2 = Person(name = "tony", age = 12)

    val person3 = PersonData(name = "tony", age = 12)
    val person4 = PersonData(name = "tony", age = 12)

    println(person1 == person2)
    println(person3 == person4)

    val set = hashSetOf(person3)
    println(set.contains(person4))

    println(person1.toString())
    println(person3.toString())

    val person5 = person3.copy(name = "stranger")
    println(person5)

    println("이름  = ${person5.component1()}, 나이 = ${person5.component2()}")

    val (name, age) = person5
    println("이름  = $name, 나이 = $age")
}