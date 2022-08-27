import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

/**
================================================
 * 백준 알고리즘 | 2525 | 오븐 시계
 * 문제 url : https://www.acmicpc.net/problem/2525
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val inputs = StringTokenizer(readLine())
    val addM = readLine().toInt()
    var addTime = (inputs.nextToken().toInt() * 60) + (inputs.nextToken().toInt()) + addM
    addTime = addTime % (24*60)

    println("${addTime / 60} ${addTime % 60}")

}