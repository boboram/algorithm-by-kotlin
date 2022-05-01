package Baekjoon.submit

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.max


fun main(args:Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()

    for (i in 1 .. t) {
        val nk = br.readLine().split(" ").map { it.toInt() }
        val times = br.readLine().split(" ").map { it.toInt() }
        val inDegree = Array((nk[0]+1)){0}
        val list = Array(nk[0]+1) { ArrayList<Int>() }

        for (j in 1 .. nk[1]) {
            val listItem = br.readLine().split(" ").map { it.toInt() }

            list.get(listItem[0]).add(listItem[1])
            inDegree[listItem[1]]++
        }

        val w = br.readLine().toInt()

        sort(w, list,inDegree, times)
    }

}

fun sort(w:Int, list : Array<ArrayList<Int>>, inDegree : Array<Int>, times : List<Int>) {
    val queue :Queue<Int> = LinkedList<Int>()
    val resTimes = times.toIntArray()

    for (i in 1..inDegree.size-1) {
        if (inDegree[i] === 0) {
            queue.add(i)
        }
    }

    while (queue.isNotEmpty()) {
        val qNum = queue.remove()

        for (i in list.get(qNum)) {
            inDegree[i]--
            if (inDegree[i] === 0) {
                queue.add(i)
            }

            resTimes[i-1] = max(resTimes[i-1], (times[i-1] + resTimes[qNum-1]))
        }
    }
    println(resTimes[w-1])
}