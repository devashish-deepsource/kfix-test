 interface ExFixOptionalAbstractKeyword {
    val number: Int
    fun method()
}

fun exUnnecessaryNotNullOperator() {
    val num = 5
    println(num!!.toString())
}

fun exEqualsNullCall3() {
    val name = "John Doe"
    println(name.equals(null))
}

fun exUnnecessarySafeCall23() {
    val ten = 10
    println(ten.toString()?.length)
}

internal class ExNestedClassesVisibility23 {
    public class Nested
}
