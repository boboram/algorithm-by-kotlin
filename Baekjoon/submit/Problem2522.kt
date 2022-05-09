package submit

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val sb = StringBuffer()
    var tempI = 1;
    for (i in 1..(n*2-1)) {
        tempI = if(i>n) ((n*2)-i) else i
        for (j in 1 .. n-tempI) sb.append(" ")
        for (k in 1 .. tempI) sb.append("*")
        sb.append("\n")
    }
    print(sb.toString())
}