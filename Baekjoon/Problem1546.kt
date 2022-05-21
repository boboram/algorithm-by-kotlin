import java.io.BufferedReader
import java.io.InputStreamReader

/**
================================================
 * 백준 알고리즘 | 1546 | 평균
 * 문제 url : https://www.acmicpc.net/problem/1546
 * 입력) 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
 * 출력) 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.
 * 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val scores = br.readLine().split(" ").map { it.toDouble() }
    var max = 0.0
    var avg = 0.0


    for (i in 0 until n) {
        max = if(scores[i] >= max) scores[i] else max
    }

    for (i in 0 until  n) {
        avg += scores[i].getScoreByMax(max)
    }

    println(avg.getAvgByScore(n))
}

fun Double.getScoreByMax(max:Double) : Double {
    return (((this/max)*100))
}

fun Double.getAvgByScore(size:Int):Double {
    return this / size
}