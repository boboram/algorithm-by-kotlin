package Baekjoon

/**
================================================
 * 백준 알고리즘 | 6679 | 싱기한 네자리 숫자
 * 문제 url : https://www.acmicpc.net/problem/6679
 * 입력) 첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
 * 출력) 첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
 */
fun main() {
    for (i in 2992 .. 9999) {
        var beforeSum = 0
        var cnt = 0
        for (binary in arrayOf(10, 12, 16)) {
            var n = i
            var binarySum = 0
            while (n != 0) {
                binarySum+=(n%binary)
                n/=binary
            }
            if (beforeSum === binarySum) cnt++
            beforeSum = binarySum
        }
        if (cnt === 2) println(i)
    }
}