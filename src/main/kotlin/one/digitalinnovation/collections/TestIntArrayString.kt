package one.digitalinnovation.collections

fun main() {
    val names = Array(3) {""}
    names[0] = "Maria"
    names[1] = "João"
    names[2] = "José"

    for (name in names) {
        println(name)
    }

    println("---------------------")
    names.sort()
    names.forEach { println (it) }

    println("---------------------")
    val names2 = arrayOf("Maria", "Zezé", "Pedro")
    names2.sort()
    names2.forEach { println(it) }
}