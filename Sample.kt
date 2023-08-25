abstract interface ExFixOptionalAbstractKeyword {
    abstract val number: Int
    abstract fun method()
}

fun exUnnecessaryNotNullOperator() {
    val num = 5
    println(num!!.toString())
}
