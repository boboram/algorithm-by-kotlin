import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * ================================================
 * 백준 알고리즘 | 3052 | 나머지
 * 문제 url : https://www.acmicpc.net/problem/3052
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val ary = IntArray(42, {0})

    for(i in 0 until 10) {
        ary[br.readLine().toInt() % 42]++
    }

    println(ary.filter { it >= 1 }.count())
}