abstract interface ExFixOptionalAbstractKeyword {
    abstract val number: Int
    abstract fun method()
}

fun exUnnecessaryNotNullOperator() {
    val num = 5
    println(num!!.toString())
}

fun exUnnecessarySafeCall() {
    val ten = 10
    println(ten.toString()?.length)
}

internal class ExNestedClassesVisibility {
    class Nested
}

fun exEqualsNullCall() {
    val name = "John Doe"
    println(name.equals(null))
}
