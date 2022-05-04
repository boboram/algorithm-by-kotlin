import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 백준 알고리즘 | 2438 별찍기1
 * 문제 url : https://www.acmicpc.net/problem/2438

 *
 **
 ***
 ****
 *****

 */
fun main(args:Array<String>)= with(BufferedReader(InputStreamReader(System.`in`))){
    repeat(readLine().toInt()) {
        println("*".repeat(it+1))
    }
}