import java.io.BufferedReader
import java.io.InputStreamReader

/**
n=4인경우 아래와 같이 출력
    *
   * *
  *   *
 *     *
 ================================================
 * 백준 알고리즘 | 10990 | 별 찍기 15
 * 문제 url : https://www.acmicpc.net/problem/10990
 */
fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val sb = StringBuffer()
    for (i in 1..n) {
        for (j in 1..n - i) sb.append(" ")
        for (k in 1..(i + (i - 1)))
            if (k == 1 || k == (i + (i - 1))) sb.append("*") else sb.append(" ")
        sb.append("\n")
    }
    print(sb.toString())
}