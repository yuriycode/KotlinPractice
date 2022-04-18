package topics

fun main() {
    val items = listOf("car", "plane", "bike") //list.of Java 9
    //mutableListOf - можливо щось змінити в списку

    for (item in items)
        println(item)

    // while
    var index = 0
    while (index < items.size) {
        println("Items at $index ${items[index]}")
        index++

    }

    //Діапазони(є також в Python)
    println(5 in 3..10) //true
    println(7 in 3..6) //false

    for (i in 1..10)
        println(i)

    for (i in 10 downTo 1)
        println(i)



}










