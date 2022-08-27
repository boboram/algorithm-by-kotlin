import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/**
================================================
 * 백준 알고리즘 | 18108 | 1998년생인 내가 태국에서는 2541년생?!
 * 문제 url : https://www.acmicpc.net/problem/18108
 */
fun main() {
    val n = BufferedReader(InputStreamReader(System.`in`)).readLine().toInt()
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write((n-543).toString())
    bw.write("\n")
    bw.flush()
    bw.close()
}