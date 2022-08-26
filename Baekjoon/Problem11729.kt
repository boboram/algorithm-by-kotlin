import java.io.BufferedReader
import java.io.InputStreamReader

var input :Int = 0
val bw=System.out.bufferedWriter()

/**
 * ================================================
 * 백준 알고리즘 | 11729 | 하노이
 * 문제 url : https://www.acmicpc.net/problem/11729
 * 이전 원판을 기준으로 a->b, a->c, b->c
 */
fun main(){
    input = BufferedReader(InputStreamReader(System.`in`)).readLine().toInt()


    bw.write((Math.pow(2.0, input.toDouble()).toInt() - 1).toString()+"\n")
    hanoi(input, 1, 2, 3)

    bw.flush()
    bw.close()
}

fun hanoi(n:Int, a:Int, b:Int, c:Int)
{
    if (n === 1) bw.write("$a $c\n")

    else {
        hanoi(n-1, a, c, b)
        bw.write("$a $c\n")
        hanoi(n-1, b, a, c)
    }
}