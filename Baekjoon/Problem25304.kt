import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/**
================================================
 * 백준 알고리즘 | 25304 | 영수증
 * 문제 url : https://www.acmicpc.net/problem/25304
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val total = readLine().toInt()
    var sum = 0
    val n = readLine().toInt()
    var inputs :StringTokenizer

    for (i in 1 .. n) {
        inputs = StringTokenizer(readLine())
        sum +=(inputs.nextToken().toInt() * inputs.nextToken().toInt())
    }

    println(if(sum===total) "Yes" else "No")
}