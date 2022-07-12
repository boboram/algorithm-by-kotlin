import java.io.BufferedReader
import java.io.InputStreamReader

/**
================================================
 * 백준 알고리즘 | 1094 | 막대기
 * 문제 url : https://www.acmicpc.net/problem/1094
 * 입력) 첫째 줄에 X가 주어진다. X는 64보다 작거나 같은 자연수이다.
 * 출력) 문제의 과정을 거친다면, 몇 개의 막대를 풀로 붙여서 Xcm를 만들 수 있는지 출력한다.
 * 2진수 만들기를 사용해서 1 비트가 나올때마다 cnt++해주면 합쳐진 막대기 수를 구할 수 있다.
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var x = br.readLine().toInt()
    var cnt = 1

    while (x > 1) {
        if ((x % 2) === 1) cnt++
        x = (x/2)
    }

    println(cnt)
}