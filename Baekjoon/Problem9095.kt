import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/**
 * ================================================
 * 백준 알고리즘 | 9095 | 1, 2, 3 더하기
 * 문제 url : https://www.acmicpc.net/problem/1463
 * 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    var dp = IntArray(11){0}
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4

    for (i in 0 until t) {
        val n = br.readLine().toInt()
        for (i in 4..n) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3]
        }
        bw.write("${dp[n]}\n")
    }

    bw.flush()
}