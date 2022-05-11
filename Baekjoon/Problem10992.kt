import java.io.BufferedReader
import java.io.InputStreamReader

/**
n=4인경우 아래와 같이 출력
    *
   * *
  *   *
 *******
 ================================================
 * 백준 알고리즘 | 10992 | 별 찍기 17
 * 문제 url : https://www.acmicpc.net/problem/10992
 */
fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val sb = StringBuffer()
    for (i in 1..n) {
        //n-i만큼 공백주고
        for (j in 1..n - i) sb.append(" ")
        /**
         * 행별로 2개씩 늘어남
         * 첫줄과 끝줄은 다 채우고
         * 다른 줄은 1열과 끝열만 *로 찍는다.
         */
        for (k in 1..(i + (i - 1))) if (i == 1 || i == n || k == 1 || k == (i + (i - 1))) sb.append("*") else sb.append(" ")
        sb.append("\n")
    }
    print(sb.toString())
}