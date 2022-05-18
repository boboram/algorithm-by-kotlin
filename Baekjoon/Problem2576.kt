import java.io.BufferedReader
import java.io.InputStreamReader

/**
================================================
 * 백준 알고리즘 | 2576 | 홀수
 * 문제 url : https://www.acmicpc.net/problem/2576
 * 입력) 입력의 첫째 줄부터 일곱 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100보다 작다.
 * 출력) 홀수가 존재하지 않는 경우에는 첫째 줄에 -1을 출력한다. 홀수가 존재하는 경우 첫째 줄에 홀수들의 합을 출력하고, 둘째 줄에 홀수들 중 최솟값을 출력한다.
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val numbers = IntArray(7, {0}) //7개 수를 받는 배열 선언
    var min = 100
    var sum = 0;

    for (i in 0 until  numbers.count()) {
        numbers[i] = br.readLine().toInt()

        if (numbers[i]%2==1) {
            sum+=numbers[i]

            if (numbers[i] <= min) {
                min = numbers[i]
            }
        }
    }

    if (sum>0) {
        println(sum) //홀수 합
        println(min) //홀수중 최솟값
    } else {
        println(-1)
    }
}