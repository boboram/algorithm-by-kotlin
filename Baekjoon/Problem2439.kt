import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 백준 알고리즘 | 2439 별찍기2
 * 문제 url : https://www.acmicpc.net/problem/2439
    *
   **
  ***
 ****
*****
 */
fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val sb = StringBuilder()
    var star = ""
    var minusLine = " ".repeat(n)

    for (i in n downTo 1){
        star +="*"
        minusLine = minusLine.substring(0, minusLine.length - 1);
        sb.append("$minusLine$star\n")
    }
    println(sb.toString())
}