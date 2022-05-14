package submit

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val sb = StringBuffer()
    for (i in 1..n) {
        if (i%2==0) sb.append(" ")
        for (j in 1..n) sb.append("* ")
        sb.append("\n")
    }
    print(sb.toString())
}