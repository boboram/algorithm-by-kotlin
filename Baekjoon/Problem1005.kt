package Baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.max

/**
 * 백준 알고리즘 | 1005 ACM Craft | 특정건물을 가장 빨리 지을 때까지 걸리는 최소시간을 알아내는 프로그램을 작성
 * 문제 url : https://www.acmicpc.net/problem/1005
 * #위상정렬(Topological sort)
 *  비순환 방향 그래프(DAG)에서 정점을 선형으로 정렬하는 것.
 *  모든 간선 (u, v)에 대해 정점 u가 정점 v보다 먼저 오는 순서로 정렬이 됨
 *  임시큐, 결과리스트, 진입점에 연결되는 진출점, 진출점의 진입횟수 필요
 *
 * 2시간동안 혼자 해보다가 도저히 못하겠어서 찾아보니
 * 위상정렬이라는 개념을 알고 있어야 풀 수 있는 문제였다.
 * 위상정렬은 그래프의 진출, 진입 개수 + 큐를 이용하여 푸는 문제였다.
 * 진입 개수가 0인 것을 상위 노드로 두고 해당 노드의 진출노드를 이어나가면서 큐에서 내보낼게 없을때까지 반복하여 순서를 구하는 문제였다.
 * 여기서 해당 문제는 해당 순서 외에 시간이라는 조건까지 뒀는데 이는
 * 같은 레벨에 있는 노드중 가장 큰 수를 구하면 된다.
 *
 * 뭔가 게임에서 어떤 전략을 세울때 쓸 수 있는 알고리즘인 것 같다. ?0?
 */
fun main(args: Array<String>) {
    /**
     * 첫째 줄에는 테스트케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 주어진다.
     * 첫째 줄에 건물의 개수 N과 건물간의 건설순서 규칙의 총 개수 K이 주어진다. (건물의 번호는 1번부터 N번까지 존재한다)
     * 둘째 줄에는 각 건물당 건설에 걸리는 시간 D1, D2, ..., DN이 공백을 사이로 주어진다. 셋째 줄부터 K+2줄까지 건설순서 X Y가 주어진다. (이는 건물 X를 지은 다음에 건물 Y를 짓는 것이 가능하다는 의미이다)
     * 마지막 줄에는 백준이가 승리하기 위해 건설해야 할 건물의 번호 W가 주어진다.
     */
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt() //케이스 횟수

    for (i in 1 .. t) {
        val nk = br.readLine().split(" ").map { it.toInt() } //n : 건물갯수, k : 건설순서 규칙 총 수
        val times = br.readLine().split(" ").map { it.toInt() } //건물당 소요되는 건설 순서
        val inDegree = Array(nk[0]+1) { 0 }
        val list = Array(nk[0]+1) { ArrayList<Int>() }

        for (i in 1..nk[1]) { //입력은 건설 순서 규칙 수만큼 돌리기
            val listItem = br.readLine().split(" ").map { it.toInt() }
            inDegree[listItem[1]]++
            list.get(listItem[0]).add(listItem[1]) //A: A에서 나가는 진출차수
            //한 아이템에 어떤 진출 아이템이 있는지 넣어주기
        }

        val w = br.readLine().toInt() //최종 건설하고자하는 건물

        sort(w, list, inDegree, times) //위상정렬 함수 호출
    }
}

/**
 * 위상 정렬 함수 + 건설 시간 구하기
 * @param findW : 최종 건설하고자하는 건물
 * @param list : 진입-진출 묶음
 * @param inDegree : 아이템별 진입 수
 * @param times : 아이템별 건설 시간(초)
 */
fun sort(findW:Int, list: Array<ArrayList<Int>>, inDegree: Array<Int>, times: List<Int>) {

    var queue :Queue<Int> = LinkedList<Int>() //순서 큐 -> 해당 큐가 empty 한 시점까지 돌린다.
    var resTimes = times.toIntArray() //반환할 때 사용하게 되는 각 건물들을 건설할때까지 걸리는 시간

    for (i in 1 .. inDegree.size-1) {
        if (inDegree[i] === 0) {
            queue.add(i)
        }
    }

    while (queue.isNotEmpty()) { //꺼낼 큐가 남아있다면
        val qNum = queue.remove() //맨 앞에 있는 큐 꺼내기

        for (i in list.get(qNum)) { //꺼낸 큐에서 나간 진출 아이템 가져와서
            inDegree[i]-- //해당 아이템들의 진입횟수 1개씩 마이너스
            if (inDegree[i] === 0) { //해당 아이템의 진입 횟수가 0이라면 큐에 넣어주기
                queue.add(i)
            }

            //res[item-1] 에는 해당 아이템까지 오기위해서 들었던 시간을 구한다.
            //res[item-1]이나 해당 큐 + 시간을 더한 수 중에서 더 큰값을 가중치로 한다.
            //변형된 아이템 건설 소요 시간 | 진입큐의 건설시간 + 원래 아이템 소요 중에서 max -> 큰 값을 소요 시간으로 보기 때문
            //res[item-1] 에는 현재 큐 말고 이전 큐에 대한 시간이 들어있을 수 도 있음 (진입차수가 2이상일때) -> 큰 값으로 처리해줘야 함
            //(resTimes[qNum-1] + times[i-1]) 에는 현 상태 큐에 대한 건설 시간
            resTimes[i-1] = max(resTimes[i-1], (resTimes[qNum-1] + times[i-1]))
        }

    }
    //최종 목표인 건물을 건설하는데 걸린 시간을 프린트한다.
    println(resTimes[findW-1])
}