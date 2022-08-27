import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

/**
 * ================================================
 * 백준 알고리즘 | 3003 | 킹, 퀸, 룩, 비숍, 나이트, 폰
 * 1 1 2 2 2 8
 * 문제 url : https://www.acmicpc.net/problem/3003
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = StringTokenizer(br.readLine())

    bw.write( "${1 - str.nextToken().toInt()} ")
    bw.write( "${1 - str.nextToken().toInt()} ")
    bw.write( "${2 - str.nextToken().toInt()} ")
    bw.write( "${2 - str.nextToken().toInt()} ")
    bw.write( "${2 - str.nextToken().toInt()} ")
    bw.write( "${8 - str.nextToken().toInt()}\n")

    bw.flush()
    bw.close()
}