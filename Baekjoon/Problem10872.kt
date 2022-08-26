import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * ================================================
 * 백준 알고리즘 | 10872 | 팩토리얼
 * 문제 url : https://www.acmicpc.net/problem/10872
 */
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    println(factorial(n))
}

fun factorial(n:Int):Int
{
    return if(n <= 1) 1 else n * factorial(n-1)
}