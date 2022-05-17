import java.io.BufferedReader
import java.io.InputStreamReader

/**
================================================
 * 백준 알고리즘 | 2562 | 최댓값
 * 문제 url : https://www.acmicpc.net/problem/2562
 * 입력) 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
 * 출력) 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val numbers = IntArray(9, {0}) //9개 수를 받는 배열 선언
    var pivot = 0

    numbers[0] = br.readLine().toInt() //0번째 방 미리 받기
    for (i in 1 .. 8) {
        numbers[i] = br.readLine().toInt()

        if (numbers[pivot] <= numbers[i]) {
            pivot = i
        }
    }

    println(numbers[pivot]) //가장 큰 방에 있는 숫자 꺼내기
    println(pivot+1) //가장 큰 방 출력
}