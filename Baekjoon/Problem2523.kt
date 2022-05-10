import java.io.BufferedReader
import java.io.InputStreamReader

/**
n=3인경우 아래와 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 출력에서 이미 2*n-1 이라는 힌트를 줬다.
 *
 **
 ***
 **
 *
 ================================================
 * 백준 알고리즘 | 2523 | 별 찍기 13
 * 문제 url : https://www.acmicpc.net/problem/2523
 */
fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val sb = StringBuffer()
    for (i in 1..(n*2-1)) {
        //i가 n보다 크다면 (절반 이후라면) 해당 i의 대칭은 (n*2)-i를 하면 구할 수 있다.
        //n보다 2배 큰 값에서 i만큼을 빼면 그 반대편의 i 값을 구할 수 있다.
        //n=3이면 n*2 = 6이고 i가 4일 때 그 반대는 2를 구해야 하는데 6-4 = 2가 나오게 된다.
        for ( k in 1 .. (if(i>n) ((n*2)-i) else i) ) sb.append("*")
        sb.append("\n")
    }
    print(sb.toString())
}