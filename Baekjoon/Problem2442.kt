import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 백준 알고리즘 | 2442 별찍기5
 * 문제 url : https://www.acmicpc.net/problem/2442
    *
   ***
  *****
 *******
*********
 */
fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())

    var trimLine = " ".repeat(n-1)
    var star = "*"
    var str = "${trimLine}${star}\n"

    for (i in 1..n-1) {
        star+="**"
        trimLine = trimLine.substring(0, trimLine.length - 1);
        str += "${trimLine}${star}\n"
    }

    println(str)
}