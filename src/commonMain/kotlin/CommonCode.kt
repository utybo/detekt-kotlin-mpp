fun concat(vararg strings: String): String {
    return strings.joinToString("")
}

expect fun platformString(): String

fun main() {
    println("Hello from " + platformString())
}

fun shouldDetectOnCommon() {
}
