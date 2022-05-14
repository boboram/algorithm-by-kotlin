import java.io.BufferedReader
import java.io.InputStreamReader

/**
n=4인경우 아래와 같이 출력
 별 사이마다 공백이 있음에 유의할 것
 * * * *
  * * * *
 * * * *
  * * * *
 ================================================
 * 백준 알고리즘 | 10995 | 별 찍기 20
 * 문제 url : https://www.acmicpc.net/problem/10995
 */
fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val sb = StringBuffer()
    for (i in 1..n) {
        //짝수는 앞에 공백이 먼저 들어오면서 시작한다.
        if (i%2==0) sb.append(" ")
        //n의 갯수만큼 별이 찍힌다.
        //별사이마다 공백이 존재한다.
        for (j in 1..n) sb.append("* ")
        sb.append("\n")
    }
    print(sb.toString())
}