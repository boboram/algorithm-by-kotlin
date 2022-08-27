import java.io.BufferedReader
import java.io.InputStreamReader

/**
================================================
 * 백준 알고리즘 | 14681 | 사분면 고르기
 * 문제 url : https://www.acmicpc.net/problem/14681
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val x = br.readLine().toInt()
    val y = br.readLine().toInt()

    val compareX = x.compareTo(0)
    val compareY = y.compareTo(0)

    println(if (compareX === 1) (if (compareY === 1) 1 else 4) else (if (compareY === 1) 2 else 3))
}