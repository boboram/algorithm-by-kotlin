import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

/**
 * ================================================
 * 백준 알고리즘 | 1157 | 단어 공부
 * 문제 url : https://www.acmicpc.net/problem/1157
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = StringTokenizer(readLine())
    val alphabet = IntArray(26){0}

    var current = 0

    for (c in input.nextToken().toCharArray()) {
        current = c - 'A'
        if (current>=32) current -=32
        alphabet[current]++
    }

    var max = 0
    var maxI = 0
    var cnt = 0

    for (i in 0 until  alphabet.size) {
        if (max <= alphabet[i]) {
            if (max<alphabet[i]) {
                cnt = 0
            } else {
                cnt++
            }
            max = alphabet[i]
            maxI = i
        }
    }

    if (cnt>0) {
        bw.write("?")
    } else {
        bw.write("${(maxI+65).toChar()}")
    }

    bw.flush()
    bw.close()
}