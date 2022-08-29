import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

/**
================================================
 * 백준 알고리즘 | 11021 | A + B - 7
 * 문제 url : https://www.acmicpc.net/problem/11021
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var inputs :StringTokenizer

    for (i in 1 .. n) {
        inputs = StringTokenizer(readLine())
        bw.write("Case #${i}: ${inputs.nextToken().toInt()+inputs.nextToken().toInt()}\n")
    }

    bw.flush()
    bw.close()
}