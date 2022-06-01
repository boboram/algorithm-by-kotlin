import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/**
================================================
 * 백준 알고리즘 | 10809 | 알파벳 찾기
 * 문제 url : https://www.acmicpc.net/problem/10809
 * 입력) 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 * 출력) 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
 *      만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
 * indexOf로 하나하나 검사하니까 성능이 좋지 못했다. 입력받은 문자열로 반복해서 해당 문자가 처음 나온 알파벳이냐? 에 대한 유무로 검사하는 로직으로 수정했다.
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val str = br.readLine()
    val alphabet = IntArray(26){-1}
    var idx :Int

    for (i in 0 until  str.length) {
        idx = ('a' - str[i]) * -1
        if (alphabet[idx] === -1) alphabet[idx] = i
    }

    for (i in alphabet) {
        bw.write("$i ")
    }

    bw.flush()
}