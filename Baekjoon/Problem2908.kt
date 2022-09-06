import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

/**
 * ================================================
 * 백준 알고리즘 | 2908 | 상수
 * 문제 url : https://www.acmicpc.net/problem/2908
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val inputs = StringTokenizer(readLine())
    var str = ""
    var str2 = ""

    for (j in inputs.nextToken()) {
        str = "$j$str"
    }
    for (j in inputs.nextToken()) {
        str2 = "$j$str2"
    }

    bw.write("${if (Integer.parseInt(str) > Integer.parseInt(str2)) str else str2}")

    bw.flush()
    bw.close()
}