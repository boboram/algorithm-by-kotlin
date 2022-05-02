package Baekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.PriorityQueue

/**
 * 백준 알고리즘 | 1766 문제집 | 문제의 개수와 먼저 푸는 것이 좋은 문제에 대한 정보가 주어졌을 때, 주어진 조건을 만족하면서 민오가 풀 문제의 순서를 결정해 주는 프로그램을 작성.
 * 문제 url : https://www.acmicpc.net/problem/1766
 */
fun main(args:Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    /**
     * 첫째 줄에 문제의 수 N(1 ≤ N ≤ 32,000)과 먼저 푸는 것이 좋은 문제에 대한 정보의 개수 M(1 ≤ M ≤ 100,000)이 주어진다.
     * 둘째 줄부터 M개의 줄에 걸쳐 두 정수의 순서쌍 A,B가 빈칸을 사이에 두고 주어진다.
     * 이는 A번 문제는 B번 문제보다 먼저 푸는 것이 좋다는 의미이다.
     */
    val nm = readLine().split(" ").map{it.toInt()}
    val lists = Array(nm[0]+1){ArrayList<Int>() }
    val inDegree = IntArray(nm[0]+1)

    //정보의 갯수만큼 반복하여 A B를 입력받는다
    repeat(nm[1]) {
        val item = readLine().split(" ").map { it.toInt() }

        //해당 B문제에 대한 진입수
        inDegree[item[1]]++
        //A문제에 이어져 있는 진출수
        lists.get(item[0]).add(item[1])
    }

    //큐에 들어온 순서가 아닌 큐 안에 들어있는 것중에서 가장 적은 수부터 꺼내도록 한다.
    val priorityQueue = PriorityQueue<Int>();

    //진입수가 0인것들만 큐에 우선적으로 넣는다.
    inDegree.forEachIndexed{index, i -> if (index > 0 && i === 0) priorityQueue.add(index) }

    //큐가 비어질 때까지 계속 돌린다.
    while(priorityQueue.isNotEmpty()) {
        val pNum = priorityQueue.poll()
        bw.write("$pNum ")

        for (i in lists.get(pNum)) {
            inDegree[i]--
            if (inDegree[i] == 0) {
                priorityQueue.add(i)
            }
        }
    }
    bw.close()
}