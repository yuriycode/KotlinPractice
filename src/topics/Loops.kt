package topics

fun main() {
    // Цикл - багаторазово виконувана послідовність команд
    //foreach
    val items = listOf("car", "plane", "bike")
                //      [0],    [1],    [2]
    //mutableListOf - змінюваний список

    for (item in items)
        println(item)

    //while
    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items [index]}")
        index++
    }

    //Діапазон(є в Python)
    println(7 in 5..10) //true
    println(5 in 7..10) //false

    for (a in 5 until 10)
        println(a)

    for (a in 10 downTo 1)
        println(a)

    for (a in 10..100 step 10)
        println(a)


    }














