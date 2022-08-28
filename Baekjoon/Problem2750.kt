import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/**
 * ================================================
 * 백준 알고리즘 | 2750 | 수 정렬하기
 * 문제 url : https://www.acmicpc.net/problem/2750
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val sort = IntArray(n,{br.readLine().toInt()})
    var tempJ = 0

    for (i in 0 until n) {
        for (j in i until n) {
            if (sort[i] >= sort[j]) {
                tempJ = sort[j]
                sort[j] = sort[i]
                sort[i] = tempJ
            }
        }
    }

    sort.map { bw.write("${it}\n") }
    bw.flush()
    bw.close()
}