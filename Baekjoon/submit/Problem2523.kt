package submit
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val sb = StringBuffer()
    for (i in 1..(n*2-1)) {
        for ( k in 1 .. (if(i>n) ((n*2)-i) else i) ) sb.append("*")
        sb.append("\n")
    }
    print(sb.toString())
}