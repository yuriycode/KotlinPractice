package topics

fun main() {
    println(testSimple(3,10))
    println(testString(125))
    testNamedArguments(y = 2, x = 5, z = 10)
    testDefaultArguments(3,5)
}

fun testSimple(x:Int, y:Int): Int = x + y   // вводимо аргументи

fun testString(y: Int): String {
    return "String is $y"
}

fun testNamedArguments(x:Int, y:Int, z:Int): List<Int> {
    return listOf(x,y,z)      // Іменовані аргументи
}

fun testDefaultArguments(x:Int = 4, y: Int = 6) {
    println(x+y)  //аргументи за замовчуванням
}