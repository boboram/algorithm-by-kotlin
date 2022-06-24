package Baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

/**
================================================
 * 백준 알고리즘 | 2231 | 분해합
 * 문제 url : https://www.acmicpc.net/problem/2231
 * 입력) 첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
 * 출력) 첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    var res = 0

    if (n>0) {
        for (i in 0 until n) {
            if (sumDigit(i) === n) {
                res = i
                break
            }
        }
    }

    println(res)
}

fun sumDigit(number:Int) :Int {
    var temp = number
    var sum = 0

    do {
        sum += (temp%10)
        temp /=10
    } while(temp != 0)

    return sum+number
}