import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max

/**
 * ================================================
 * 백준 알고리즘 | 14501 | 퇴사
 * 문제 url : https://www.acmicpc.net/problem/14501
 * 상담을 적절히 했을 때, 백준이가 얻을 수 있는 최대 수익을 구하는 프로그램을 작성하시오.
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    var dp = IntArray(n+2){0}
    val data = Array(n+1) { IntArray(2) }

    for (i in 1 .. n) {
        val str = StringTokenizer(br.readLine())
        data[i][0] = str.nextToken().toInt()
        data[i][1] = str.nextToken().toInt()
    }

    for (i in n downTo  1) {
        if((data[i][0] + i) > n+1) {
            dp[i] = dp[i+1]
        } else {
            dp[i] = max(dp[data[i][0]+i]+data[i][1], dp[i+1])
        }
    }

    println(dp.maxOrNull())
}