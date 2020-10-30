import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var number = scanner.nextInt()
    var reverse: Int = 0
    while (number != 0) {
        reverse = reverse * 10 + number % 10;
        number /= 10;
    }
    println(reverse)

}