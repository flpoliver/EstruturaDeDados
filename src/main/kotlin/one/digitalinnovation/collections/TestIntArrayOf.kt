package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 12, 7)

    values.sort()
    values.forEach {
        println(it)
    }
}