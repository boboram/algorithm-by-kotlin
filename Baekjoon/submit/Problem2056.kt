package Baekjoon.submit

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer
import kotlin.math.max

fun main(args:Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val times = Array<Int>(n){0}
    val inDegree = Array<Int>(n+1){0}
    val lists = Array(n+1){ArrayList<Int>()}

    for (i in 1..n) {
        val listItem = StringTokenizer(br.readLine())
        times[i-1] = listItem.nextToken().toInt()

        repeat(listItem.nextToken().toInt()) {
            inDegree[i]++
            lists.get(listItem.nextToken().toInt()).add(i)
        }
    }

    topologyJobSort(lists, times, inDegree)
}

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
            resTimes[i-1] = max(resTimes[i-1], (resTimes[qNum-1] + times[i-1]))
        }
    }

    println(resTimes.maxOrNull())
}