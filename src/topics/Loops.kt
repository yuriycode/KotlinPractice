package topics

fun main(){
    //for each
    val items = listOf ("apple", "banana", "orange") // List.of Java 9
    //mutableOf ("apple", "banana", "orange") список, який можемо змінювати

    for (item in items)
        println(item)

   //While

    var index = 0
    while(index < items.size) {
        println("Item at $index is ${items[index]}")
    index++
}

    // Диапазоны (є в Python)
   print (7 in 5..10) // true
   print(5 in 6..20) // false

    for (i in 25..100) // виводиться повністю
    println(i)
    for (i in 25 until 35) // виводиться до 34
        println(i)

    for (i in 25 downTo 1) // в зворотньому напрямку
        println(i)

    for (i in 100..1000 step 100) // тут вираховуємо в сотнях
        println(i)
}