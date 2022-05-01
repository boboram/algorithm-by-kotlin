package Baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

/**
 * 백준 알고리즘 | 2252 줄 세우기 | 일부 학생들의 키를 비교한 결과가 주어졌을 때, 줄을 세우는 프로그램을 작성하시오.
 * 문제 url : https://www.acmicpc.net/problem/2252
 */
fun main(args:Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    /**
     * 첫째 줄에 N(1 ≤ N ≤ 32,000), M(1 ≤ M ≤ 100,000)이 주어진다.
     * M은 키를 비교한 회수이다. 다음 M개의 줄에는 키를 비교한 두 학생의 번호 A, B가 주어진다. 이는 학생 A가 학생 B의 앞에 서야 한다는 의미이다.
     */
    val nm = readLine().split(" ").map{it.toInt()}
    val list = Array(nm[0]+1){ArrayList<Int>()}
    val inDegree = IntArray(nm[0]+1)

    for (i in 1..nm[1]) {
        val listItem = readLine().split(" ").map{it.toInt()}

        inDegree[listItem[1]]++
        list.get(listItem[0]).add(listItem[1])
    }

    stdSort(list, inDegree)
}

/**
 * 학생 위상 정렬 함수
 * @param list : 학생별 진입-진출 리스트
 * @param inDegree : 진입 차수 리스트
 */
fun stdSort(list:Array<ArrayList<Int>>, inDegree:IntArray) {
    val queue : Queue<Int> = LinkedList<Int>()
    val str = StringBuilder()

    for (i in 1..inDegree.size-1) {
        if (inDegree[i] === 0) {
            queue.add(i)
        }
    }

    while (queue.isNotEmpty()) {

        val qNum = queue.poll()

        str.append("$qNum ")

        for (i in list.get(qNum)) {
            inDegree[i]--
            if (inDegree[i] === 0) {
                queue.add(i)
            }
        }
    }

    println(str)
}