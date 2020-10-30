import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val number = scanner.nextInt()+1
    if(number % 2 == 0){
        println(number)
    }else{
        println(number+1)
    }
}