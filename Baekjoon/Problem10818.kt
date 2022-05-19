import java.io.BufferedReader
import java.io.InputStreamReader

/**
================================================
 * 백준 알고리즘 | 10818 | 최소, 최대
 * 문제 url : https://www.acmicpc.net/problem/10818
 * 입력) 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 * 출력) 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val inputs = br.readLine().split(" ")
    var min = inputs[0].toInt()
    var max = inputs[0].toInt()

    for (i in 1 until n) {
        val input = inputs[i].toInt()
        min = if(input <= min) input else min
        max = if(input >= max) input else max
    }

    println("$min $max")
}