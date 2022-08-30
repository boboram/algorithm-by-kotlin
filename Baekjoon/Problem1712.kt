import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/**
 * ================================================
 * 백준 알고리즘 | 1712 | 손익분기점
 * 문제 url : https://www.acmicpc.net/problem/1712
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = StringTokenizer(readLine())
    val a = Integer.parseInt(str.nextToken())
    val b = Integer.parseInt(str.nextToken())
    val c = Integer.parseInt(str.nextToken())

    if (c<=b) {
        println(-1)
    } else {
        println((a/(c-b))+1)
    }
}