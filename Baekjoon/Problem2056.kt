package Baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer
import kotlin.math.max

/**
 * 백준 알고리즘 | 2056 작업 | 특정건물을 가장 빨리 지을 때까지 걸리는 최소시간을 알아내는 프로그램을 작성
 * 문제 url : https://www.acmicpc.net/problem/2056
 * 모든 작업을 완료하기 위한 최소 시간 구하기
 * 동시간대에 시작한 작업이 있는경우 가장 큰 시간을 기준으로 +
 * 작업중에서 가장 오래 걸린 작업시간을 결과값으로 한다.
 */
fun main(args:Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    /**
     * 첫째 줄에 N이 주어진다.
     * 걸리는 시간 | 선행관계 작업 개수 | 선행 작업 번호
     * 각 줄의 처음에는, 해당 작업에 걸리는 시간이 먼저 주어지고,
     * 그 다음에 그 작업에 대해 선행 관계에 있는 작업들의 개수(0 ≤ 개수 ≤ 100)가 주어진다. 그리고 선행 관계에 있는 작업들의 번호가 주어진다.
     */
    val n = br.readLine().toInt()
    val times = Array<Int>(n) { 0 }
    val inDegree = Array<Int>(n + 1) { 0 }
    val lists = Array(n + 1) { ArrayList<Int>() }

    for (i in 1..n) {
        val listItem = StringTokenizer(br.readLine())
        times[i - 1] = listItem.nextToken().toInt()

        repeat(listItem.nextToken().toInt()) {
            inDegree[i]++
            lists.get(listItem.nextToken().toInt()).add(i)
        }
    }

    topologyJobSort(lists, times, inDegree)
}

/**
 * 작업 위상 정렬 함수
 * @param lists 진입-진출 묶음
 * @param times 작업 시간
 * @param inDegree 진입 수
 */
fun topologyJobSort(lists:Array<ArrayList<Int>>, times:Array<Int>, inDegree:Array<Int>) {
    val queue:Queue<Int> = LinkedList<Int>()
    val resTimes = times.toIntArray()

    for (i in 1 .. inDegree.size-1) {
        if (inDegree[i] === 0) {
            queue.add(i)
        }
    }

    while(queue.isNotEmpty()) {
        val qNum = queue.poll()

        for (i in lists.get(qNum)) {
            inDegree[i]--

            if (inDegree[i] === 0) {
                queue.add(i)
            }

            //res[item-1] 에는 해당 아이템까지 오기위해서 들었던 시간을 구한다.
            //res[item-1]이나 해당 큐 + 시간을 더한 수 중에서 더 큰값을 가중치로 한다.
            //변형된 작업 소요 시간 | 진입큐의 작업시간 + 원래 아이템 소요 중에서 max -> 큰 값을 소요 시간으로 보기 때문
            //res[item-1] 에는 현재 큐 말고 이전 큐에 대한 시간이 들어있을 수 도 있음 (진입차수가 2이상일때) -> 큰 값으로 처리해줘야 함
            //(resTimes[qNum-1] + times[i-1]) 에는 현 상태 큐에 대한 작업 시간
            resTimes[i-1] = max(resTimes[i-1], (resTimes[qNum-1] + times[i-1]))
        }
    }

    //여기서 다시 max를 해주는 이유는?
    //모든 작업이 끝난 최소 시간을 구하라고 하였기 때문에
    //구해진 작업 시간 중에서 가장 큰 값이 결과가 된다
    println(resTimes.maxOrNull())
}