import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/**
 * ================================================
 * 백준 알고리즘 | 2588 | 곱셈
 * 문제 url : https://www.acmicpc.net/problem/2588
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num1 = br.readLine().toInt()
    val num2 = br.readLine().toInt()
    var mok = num2

    while (mok > 0) {
        bw.write("${num1 * (mok % 10)}\n")
        mok /= 10
    }

    bw.write( "${num1*num2}\n")

    bw.flush()
    bw.close()
}