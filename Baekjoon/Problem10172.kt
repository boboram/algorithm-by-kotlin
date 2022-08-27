import java.io.BufferedWriter
import java.io.OutputStreamWriter

/**
================================================
 * 백준 알고리즘 | 10172 | 개
 * 문제 url : https://www.acmicpc.net/problem/10172
 */
fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("|\\_/|\n")
    bw.write("|q p|   /}\n")
    bw.write("( 0 )\"\"${'"'}\\\n")
    bw.write("|\"^\"`    |\n")
    bw.write("||_/=\\\\__|\n")
    bw.flush()
    bw.close()
}