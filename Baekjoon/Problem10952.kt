import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

/**
================================================
 * 백준 알고리즘 | 10952 | A + B - 5
 * 문제 url : https://www.acmicpc.net/problem/10952
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var inputs :StringTokenizer

    while (true) {
        inputs = StringTokenizer(readLine())
        var num1 = Integer.parseInt(inputs.nextToken())
        var num2 = Integer.parseInt(inputs.nextToken())

        if (num1 === 0 && num2 === 0) break
        var sum = num1 + num2
        bw.write("$sum\n")
    }


    bw.flush()
    bw.close()
}