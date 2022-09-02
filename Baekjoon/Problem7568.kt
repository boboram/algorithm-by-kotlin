import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

/**
 * ================================================
 * 백준 알고리즘 | 7568 | 덩치
 * 문제 url : https://www.acmicpc.net/problem/7568
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val bulks = Array(n) { IntArray(3) }

    for (i in 0 until n) {
        val str = StringTokenizer(readLine())

        bulks[i][0] = Integer.parseInt(str.nextToken())
        bulks[i][1] = Integer.parseInt(str.nextToken())
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i === j) continue
            if ((bulks[i][0] < bulks[j][0]) && (bulks[i][1] < bulks[j][1])) {
                bulks[i][2]++
            }
        }
    }

    for (i in 0 until n) {
        bw.write("${bulks[i][2]+1} ")
    }

    bw.flush()
    bw.close()
}