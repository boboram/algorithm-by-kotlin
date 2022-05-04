import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 백준 알고리즘 | 2444 별찍기7
 * 문제 url : https://www.acmicpc.net/problem/2444
 */
fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())

    var trimLine = " "
    var len = n+(n-1)
    var star = "*".repeat(len)
    var str = "${star}"

    for (i in 2..n) {
        len = len-2
        star = star.substring(0, len)
        str = "${trimLine}${star}\n${str}\n${trimLine}${star}"
        trimLine += " "
    }

    println(str)
}
/**
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */
