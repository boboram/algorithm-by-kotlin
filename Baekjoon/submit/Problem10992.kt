package submit

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val sb = StringBuffer()
    for (i in 1..n) {
        for (j in 1..n - i) sb.append(" ")
        for (k in 1..(i + (i - 1))) if (i == 1 || i == n || k == 1 || k == (i + (i - 1))) sb.append("*") else sb.append(" ")
        sb.append("\n")
    }
    print(sb.toString())
}