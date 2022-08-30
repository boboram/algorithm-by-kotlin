import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/**
 * ================================================
 * 백준 알고리즘 | 2869 | 달팽이는 올라가고 싶다
 * 문제 url : https://www.acmicpc.net/problem/2869
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = StringTokenizer(readLine())
    val a = Integer.parseInt(str.nextToken())
    val b = Integer.parseInt(str.nextToken())
    val v = Integer.parseInt(str.nextToken())

    println( Math.ceil((v-b).toDouble() / (a-b).toDouble()).toInt() )
}