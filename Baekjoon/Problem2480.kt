import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

/**
================================================
 * 백준 알고리즘 | 2480 | 주사위 세개
 * 문제 url : https://www.acmicpc.net/problem/2480
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val inputs = StringTokenizer(readLine())
    val num1 = inputs.nextToken().toInt()
    val num2 = inputs.nextToken().toInt()
    val num3 = inputs.nextToken().toInt()

    if ((num1 === num2) && (num2 === num3)) {
        println(10000+(num1*1000))
    } else if((num1 === num2) || (num1 === num3)) {
        println(1000+(num1*100))
    } else if (num2 === num3) {
        println(1000+(num2*100))
    } else {
        println( Math.max(Math.max(num1,num2), num3) * 100 )
    }

}