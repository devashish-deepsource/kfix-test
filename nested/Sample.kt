fun exEqualsNullCall() {
    val name = "John Doe"
    println(name.equals(null))
}

fun exUnnecessarySafeCall2() {
    val ten = 10
    println(ten.toString()?.length)
}

internal class ExNestedClassesVisibility2 {
    class Nested
}
