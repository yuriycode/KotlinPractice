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
}