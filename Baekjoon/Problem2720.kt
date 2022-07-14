import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/**
================================================
 * 백준 알고리즘 | 2720 | 세탁소 사장 동혁
 * 문제 url : https://www.acmicpc.net/problem/2720
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    var c = IntArray(n, {br.readLine().toInt()})
    var change = arrayOf(25, 10, 5, 1)

    for (i in 0 until n) {
        for (j in 0 until change.size) {
            bw.write("${c[i] / change[j]} ")
            c[i] = c[i] % change[j]
        }

        bw.write("\n")
    }

    bw.flush()
}