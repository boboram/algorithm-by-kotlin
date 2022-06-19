package Baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 백준 알고리즘 | 1032 | 명령 프롬프트
 * 문제 url : https://www.acmicpc.net/problem/1032
 * 입력: 첫째 줄에 파일 이름의 개수 N이 주어진다. 둘째 줄부터 N개의 줄에는 파일 이름이 주어진다. N은 50보다 작거나 같은 자연수이고 파일 이름의 길이는 모두 같고 길이는 최대 50이다. 파일이름은 알파벳 소문자와 '.' 로만 이루어져 있다.
 * 출력: 첫째 줄에 패턴을 출력하면 된다.
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var res = br.readLine().toCharArray()

    for (i in 1 until n) {
        val input = br.readLine()
        for ((idx, value) in input.toCharArray().withIndex()) {
            if ( res[idx] != value) {
                res[idx] = '?'
            }
        }
    }

    println(res)
}