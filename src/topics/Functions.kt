package topics

//Функції структурують програму на логічно завершені частини
fun main() {
    println(testSimple(3, 11))
    println(testString(5))
}

fun testSimple(x:Int, y:Int) = x + y

fun testString(x: Int):String{
    return "String is $x"


}






