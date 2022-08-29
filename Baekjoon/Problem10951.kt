import java.io.*
import java.util.StringTokenizer

/**
================================================
 * 백준 알고리즘 | 10951 | A + B - 4
 * 문제 url : https://www.acmicpc.net/problem/10951
 */
fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    var s:String

    while(true) {
        s=br.readLine()?:break
        val inputs = StringTokenizer(s)
        val num1 = inputs.nextToken().toInt()
        val num2 = inputs.nextToken().toInt()
        bw.write("${num1+num2}\n")
    }

    bw.flush()
    bw.close()
}