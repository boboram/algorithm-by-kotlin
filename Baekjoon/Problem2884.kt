import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/**
 * ================================================
 * 백준 알고리즘 | 2884 | 알람 시계
 * 문제 url : https://www.acmicpc.net/problem/2884
 * 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)
 * ex) 0 45 -> 0 0
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = StringTokenizer(br.readLine())
    var inputH = str.nextToken().toInt()
    inputH = if (inputH === 0) 24 else inputH
    val inputM = str.nextToken().toInt()
    val input = ((inputH*60) + inputM) - 45
    var outputH = input/60
    outputH = if (outputH === 24) 0 else outputH

    println("${outputH} ${input%60}")
}