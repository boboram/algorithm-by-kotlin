import java.io.BufferedReader
import java.io.InputStreamReader

/**
n=4인경우 아래와 같이 출력 n만큼 같은 모양을 찍으면 됨!
* *
 * *
* *
 * *
* *
 * *
* *
 * *
 ================================================
 * 백준 알고리즘 | 10996 | 별 찍기 21
 * 문제 url : https://www.acmicpc.net/problem/10996
 */
fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val sb = StringBuffer()

    for (i in 1 .. n) {
        //첫줄엔 입력한 n/2 + n/2한나머지값 만큼 * 를 찍어 준다.
        //n%2 를 더한 것은 n 이 홀수인 경우를 대비학 위함
        for (j in 1 .. n/2+n%2) sb.append("* ")
        sb.append("\n ")
        //그 나머지 수만큼 찍어줍니다.
        for (k in 1 .. n/2) sb.append("* ")
        sb.append("\n")
    }

    print(sb.toString())
}