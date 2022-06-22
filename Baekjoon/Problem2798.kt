package Baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

/**
================================================
 * 백준 알고리즘 | 2798 | 블랙잭
 * 문제 url : https://www.acmicpc.net/problem/2798
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var inputs = StringTokenizer(readLine())
    val n = inputs.nextToken().toInt()
    val m = inputs.nextToken().toInt()
    inputs = StringTokenizer(readLine())
    val cardNumbers = IntArray(n)
    var max = -1

    for (i in 0 until n) {
        cardNumbers[i] = inputs.nextToken().toInt()
    }

    loop@ for (i in 0 until n) {
        for (j in i+1 until n) {
            for (k in j+1 until n) {

                val tempSum = (cardNumbers[i] + cardNumbers[j] + cardNumbers[k])
                if ( tempSum <= m && tempSum >= max ) max = tempSum

                if (max === m) break@loop
            }
        }
    }

    println(max)
}