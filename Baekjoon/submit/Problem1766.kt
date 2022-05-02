package Baekjoon.submit

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.PriorityQueue

fun main(args:Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val nm = readLine().split(" ").map{it.toInt()}
    val lists = Array(nm[0]+1){ArrayList<Int>() }
    val inDegree = IntArray(nm[0]+1)

    repeat(nm[1]) {
        val item = readLine().split(" ").map { it.toInt() }
        inDegree[item[1]]++
        lists.get(item[0]).add(item[1])
    }

    val priorityQueue = PriorityQueue<Int>();

    inDegree.forEachIndexed{index, i -> if (index > 0 && i === 0) priorityQueue.add(index) }

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