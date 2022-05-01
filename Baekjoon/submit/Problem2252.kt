package Baekjoon.submit

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

fun main(args:Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
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