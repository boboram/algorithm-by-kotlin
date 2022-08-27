import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

/**
================================================
 * 백준 알고리즘 | 1330 | 두 수 비교하기
 * 문제 url : https://www.acmicpc.net/problem/1330
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var inputs = StringTokenizer(readLine())
    val num1 = inputs.nextToken().toInt()
    val num2 = inputs.nextToken().toInt()

    println(when(num1.compareTo(num2)) {
        1 -> ">"
        -1 -> "<"
        else -> "=="
    })
}