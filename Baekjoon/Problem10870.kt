import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * ================================================
 * 백준 알고리즘 | 10870 | 피보나치
 * 문제 url : https://www.acmicpc.net/problem/10870
 */
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    println(fibonacci(n))
}

fun fibonacci(n:Int):Int
{
    return if(n <= 1) n else fibonacci(n-1) + fibonacci(n-2)
}