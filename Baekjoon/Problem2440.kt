import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 백준 알고리즘 | 2440 별찍기3
 * 문제 url : https://www.acmicpc.net/problem/2440
 *****
 ****
 ***
 **
 *
 */
fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    var star = "*"
    var str = "*"

    for (i in 1..n-1) {
        star+="*"
        str = "${star}\n${str}"
    }

    println(str)
}