import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val character = scanner.next().first()
    println(character.isUpperCase() || if (character.isDigit()) character.toString().toInt() in 1..9 else false)
}