import java.io.BufferedReader
import java.io.InputStreamReader

/**
================================================
 * 백준 알고리즘 | 2217 | 로프
 * 문제 url : https://www.acmicpc.net/problem/2217
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var numbers = IntArray(n, {br.readLine().toInt()})
    numbers.sortDescending()
    var max = 0

    for (i in 0 until  numbers.size) {
        if ((numbers[i] * (i+1)) >= max) max = (numbers[i] * (i+1))
    }

    println(max)
}