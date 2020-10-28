import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val population = scanner.nextInt()
    val nationalAssembly = Math.cbrt(population.toDouble()).toInt()
    println(nationalAssembly)

}