import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 백준 알고리즘 | 2443 별찍기6
 * 문제 url : https://www.acmicpc.net/problem/2443
 *

 *********
  *******
   *****
    ***
     *
 */
fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())

    var trimLine = " ".repeat(n-1)
    var star = "*"
    var str = "${trimLine}${star}"

    for (i in 2..n) {
        star+="**"
        trimLine = trimLine.substring(0, (n-i));
        str = "${trimLine}${star}\n${str}"
    }

    println(str)
}