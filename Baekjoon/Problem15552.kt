import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

/**
================================================
 * 백준 알고리즘 | 15552 | 빠른 A + B
 * 문제 url : https://www.acmicpc.net/problem/15552
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var inputs :StringTokenizer
    for (i in 1 .. n) {
        inputs= StringTokenizer(readLine())
        bw.write("${inputs.nextToken().toInt() + inputs.nextToken().toInt()}\n")
    }

    bw.flush()
    bw.close()
}