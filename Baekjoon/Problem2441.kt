import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 백준 알고리즘 | 2441 별찍기4
 * 문제 url : https://www.acmicpc.net/problem/2441

 *****
  ****
   ***
    **
     *
 */
fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    var star = ""
    var str = ""
    var minusLine = " ".repeat(n)

    for (i in 1..n) {
        star+="*"
        minusLine = minusLine.substring(0, minusLine.length - 1);
        str = "${minusLine}${star}\n${str}"
    }

    println(str)
}