import java.io.BufferedReader
import java.io.InputStreamReader

/**
n=4인경우 아래와 같이 출력
    *
   * *
  * * *
 * * * *
 ================================================
 * 백준 알고리즘 | 10991 | 별 찍기 16
 * 문제 url : https://www.acmicpc.net/problem/10991
 */
fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val sb = StringBuffer()

    for (i in 1 .. n) {

        //n-i만큼 공백주고
        for (j in 1 .. n-i) sb.append(" ")
        //행별로 2개씩 늘어남
        for (k in 1 .. (i + (i-1))) {
            //홀수일때는 *, 짝수일때는 " "
            if (k%2==0) sb.append(" ") else sb.append("*")
        }
        sb.append("\n")
    }

    print(sb.toString())
}