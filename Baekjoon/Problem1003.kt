import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/**
 * 백준 알고리즘 | 피보나치함수 | 1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.
 * 문제 url : https://www.acmicpc.net/problem/1003
 * 풀이과정
 * fibonacci(n)을 여러번 그려보는데 거기서 어떤 공식을 찾을 수 있었다.
 * 0의 갯수와 1의 갯수가 fibonacci(n-1), fibonacci(n) 이라는 사실이었다.
 * 때문에 문제에서 보여준 피보나치함수를 이용해서 값을 구할 이유가 없었고
 * 배열에 각각의 값을 세팅해서 해당 값만을 출력하게끔 하였다. : )
 */
fun main(args:Array<String>) {
    var arr = IntArray(41, { 0 } )

    for (i in 1..40) {
        if (i == 1) {
            arr[i] = 1
        } else {
            arr[i] = arr[i-1] + arr[i-2]
        }
    }

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    val cnt = br.readLine().toInt()

    for (i in 1 .. cnt) {
        val n = br.readLine().toInt()
        var str = "1 0\n"

        if (n > 0) {
            str = "${arr[n-1]} ${arr[n]}\n"
        }
        bw.write(str)
        bw.flush()
    }
}