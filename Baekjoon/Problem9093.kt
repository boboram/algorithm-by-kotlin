import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/**
 * 입력: 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
 * 출력: 각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.
================================================
 * 백준 알고리즘 | 9093 | 단어 뒤집기
 * 문제 url : https://www.acmicpc.net/problem/9093
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val n = br.readLine().toInt()

    for (i in 0 until n) {
        val str = br.readLine().split(" ")

        for (item in str) {
            bw.write("${item.reversed()} ")
        }
        bw.write("\n")
    }

    bw.close()
}