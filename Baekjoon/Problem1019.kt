package Baekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/**
 * 백준 알고리즘 | 1019 | 책 페이지
 * 문제 url : https://www.acmicpc.net/problem/1019
 * 지민이는 전체 페이지의 수가 N인 책이 하나 있다. 첫 페이지는 1 페이지이고, 마지막 페이지는 N 페이지이다. 각 숫자가 전체 페이지 번호에서 모두 몇 번 나오는지 구해보자.
 * 입력 : 첫째 줄에 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
 * 첫째 줄에 0이 총 몇 번 나오는지, 1이 총 몇 번 나오는지, ..., 9가 총 몇 번 나오는지를 공백으로 구분해 출력한다.
 */
fun main(args: Array<String>) {
    val arr = IntArray(10, {0})
    val n = BufferedReader(InputStreamReader(System.`in`)).readLine().toInt()
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 0..n) {
        var item :Int = i
        while (item != 0) {
            arr[item%10]++
            item/=10
        }
    }

    for (item in arr) {
        bw.write("$item ")
    }

    bw.close()
}