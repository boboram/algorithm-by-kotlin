import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * ================================================
 * 백준 알고리즘 | 2753 | 윤년
 * 문제 url : https://www.acmicpc.net/problem/2753
 * 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val year = br.readLine().toInt()

    println(isLeapYear(year))
}

fun isLeapYear(year:Int):Int{
    var res = 0
    if ( (year%400 == 0) or ((year%100!=0) && (year%4 == 0)) ) {
        res = 1
    }

    return res
}