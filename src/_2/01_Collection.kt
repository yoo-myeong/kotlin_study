﻿import java.util.LinkedList

fun main() {

    // immutable
    val currencyList = listOf("dollar", "euro", "won")

    // mutable
    val mutableCurrencyList = mutableListOf<String>()
    mutableCurrencyList.add("dollar")
    mutableCurrencyList.add("euro")
    mutableCurrencyList.add("won")

    val mutableCurrencyListApply = mutableListOf<String>().apply {
        add("dollar")
        add("euro")
        add("won")
    }

    // immutable set
    val numberSEt = setOf<Int>(1,2,3,4)

    // mutable set
    val mutableSet = mutableSetOf<Int>().apply{
        add(1)
        add(2)
        add(3)
        add(4)
    }

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2)

    // mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1
    mutableNumberMap["two"] = 2

    // collection builder
    val numberList = buildList<Int> {
        add(1)
        add(2)
        add(3)
    }

    // linked list
    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }

    // arrayList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = currencyList.iterator()
    while (iterator.hasNext()){
        println(iterator.next())
    }

    for (currency in currencyList) {
        println(currency)
    }

    currencyList.forEach {
        println(it)
    }

    // map
    val lowerList = listOf("a", "b", "c")
    val upperList = lowerList.map { it.uppercase() }
    val filteredList = lowerList.filter {it=="a" || it == "c"}
}