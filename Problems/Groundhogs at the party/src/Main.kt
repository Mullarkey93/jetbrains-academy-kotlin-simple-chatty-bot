import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val number_of_reeses = scanner.nextInt()
    val weekend = scanner.nextBoolean()

    if((weekend && number_of_reeses in 15..25)||(!weekend && number_of_reeses in 10..20)){
        println(true)
    }else{
        println(false)
    }
}