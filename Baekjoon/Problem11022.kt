import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

/**
================================================
 * 백준 알고리즘 | 11022 | A + B - 8
 * 문제 url : https://www.acmicpc.net/problem/11022
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1 .. n) {
        var inputs =StringTokenizer(readLine())
        var input1 = inputs.nextToken().toInt()
        var input2 = inputs.nextToken().toInt()
        var sum = input1 + input2
        bw.write("Case #$i: $input1 + $input2 = $sum\n")
    }

    bw.flush()
}