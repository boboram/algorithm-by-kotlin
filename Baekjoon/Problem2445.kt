import java.io.BufferedReader
import java.io.InputStreamReader

/**

 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 ================================================
 * 백준 알고리즘 | 2445 별찍기8 나비!!
 * 문제 url : https://www.acmicpc.net/problem/2445
 */
fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val sb = StringBuffer()

    for (i in 1 .. (n + (n-1))) {
        //n을 기준으로 n이 5라고 했을때 4랑 6은 같은 문자열을 출력하는데 그 인덱스를 찾기위한 문장임
        val tempI = if(i>n) i - ((i % n) * 2) else i

        for (j in 1 .. tempI) sb.append("*") //첫 별
        for (k in 1 .. (2 * (n-tempI))) sb.append(" ") //공백 - n-인덱스 5-4 = 1 개의 공백 출력되도록 식 작성
        for (l in 1 .. tempI) sb.append("*") //마지막별
        sb.append("\n")
    }

    println(sb.toString())
}