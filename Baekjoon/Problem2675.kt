import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

/**
 * ================================================
 * 백준 알고리즘 | 2675 | 문자열 반복
 * 문제 url : https://www.acmicpc.net/problem/2675
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()

    for (i in 0 until n) {
        val inputs = StringTokenizer(readLine())

        val strN = inputs.nextToken().toInt()
        val str = inputs.nextToken()

        for (j in str) {
            for(k in 0 until strN) {
                bw.write("$j")
            }
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}