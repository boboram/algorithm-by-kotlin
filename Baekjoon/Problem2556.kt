import java.io.BufferedReader
import java.io.InputStreamReader

/**
 n=2
**
**
지금까지 안 나온 별 찍기가 뭐가 있는지 생각해본 후, 별을 적절히 찍으세요.
================================================
 * 백준 알고리즘 | 2556 | 별 찍기 14
 * 문제 url : https://www.acmicpc.net/problem/2556
 * 이것저것 안나왔던 것들 해봤는데도 다 틀렸다고 나왔다. 검색해서 봤더니 정사각형 찍으면 된다고해서 했더니 정답이라고 했다. (속상)
 */
fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val sb = StringBuffer()

    for (i in 1 .. n) {
        for (j in 1 .. n) sb.append("*")
        sb.append("\n")
    }

    print(sb.toString())
}