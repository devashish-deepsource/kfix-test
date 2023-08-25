fun exUnnecessarySafeCall() {
    val ten = 10
    println(ten.toString()?.length)
}

internal class ExNestedClassesVisibility {
    class Nested
}
