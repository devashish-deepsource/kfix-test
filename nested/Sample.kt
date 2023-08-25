fun exEqualsNullCall() {
    val name = "John Doe"
    println(name == null)
}

fun exUnnecessarySafeCall2() {
    val ten = 10
    println(ten.toString()?.length)
}

internal class ExNestedClassesVisibility2 {
    public class Nested
}
