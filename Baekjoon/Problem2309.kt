import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * ================================================
 * 백준 알고리즘 | 2309 | 일곱난쟁이
 * 문제 url : https://www.acmicpc.net/problem/2309
 * 아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 주어지는 키는 100을 넘지 않는 자연수이며, 아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = 9
    val dwarf = IntArray(n){br.readLine().toInt()}
    val sum = dwarf.sum()
    val notExist = IntArray(2){0}
    dwarf.sort()

    loop@ for (i in 0 until  n) {
        for (j in i until n) {
            if (100 == sum - (dwarf[i] + dwarf[j])) {
                notExist[0] = i
                notExist[1] = j
                break@loop
            }
        }
    }

    for (i in 0 until n) {
        if ((i in notExist)) continue
        println(dwarf[i])
    }
}