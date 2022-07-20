import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

/**
 * ================================================
 * 백준 알고리즘 | 1463 | 1로 만들기
 * 문제 url : https://www.acmicpc.net/problem/1463
 * 1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
 * 2. X가 2로 나누어 떨어지면, 2로 나눈다.
 * 3. 1을 뺀다.
 */
class Solution(n:Int) {

    var n:Int = n
    var dp = IntArray(n+1){0}

    fun makeOneNumber() {
        for (i in 2 ..  n) {
            dp[i] = dp[i-1] + 1

            if(i % 2 === 0) dp[i] = min(dp[i], dp[i/2]+1)
            if(i % 3 === 0) dp[i] = min(dp[i], dp[i/3]+1)
        }

    }

    fun printMinCount() = println(dp[n])

}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val solution=Solution(br.readLine().toInt())
    solution.makeOneNumber()
    solution.printMinCount()
}