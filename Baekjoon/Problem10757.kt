import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger
import java.util.StringTokenizer

/**
 * ================================================
 * 백준 알고리즘 | 10757 | 큰수 A+B
 * 문제 url : https://www.acmicpc.net/problem/10757
 */
fun main() {
    val inputs = StringTokenizer(BufferedReader(InputStreamReader(System.`in`)).readLine())

    println((inputs.nextToken().toBigInteger() + inputs.nextToken().toBigInteger()))
}