import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 백준 알고리즘 | 2446 별찍기9 모래시계
 * 문제 url : https://www.acmicpc.net/problem/2446
 */
fun main() {
    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val sb = StringBuffer()

    /**
     * n=5라면
     * n + (n-1) = 9줄까지 반복문을 돌린다.
     */
    for (i in 1 .. (n + (n-1))) {
        /**
         * 모래시계 위아래를 기준으로 나눠서 반복문을 돌리지 않고
         * 한 사이클로 끝내기 위해서는 i를 를 변경하면 된다.
         * 모래시계를 보면 1줄과 끝줄이 같은 모양을 띈다.
         * 4번째 줄과 6번째 줄이 같은 모양을 띈다.
         * i 가 n보다 작다면 i를 그대로 사용하면 되지만
         * n보다 크다면
         * i=6이라면 4라는 값이 나와야 하는데 2라는 값을 빼야만 4라는 값을 구할 수 있다는 것을 도출했고
         * i에 ((i % n) * 2) 라는 식을 빼주면 원하는 값을 도출할 수 있었다.
         */
        val tempI = if(i>n) i - ((i % n) * 2) else i

        //공백 찍기 공백은 tempI만큼 찍는다
        for (k in 0 .. (tempI-2)) sb.append(" ")
        //별찍기 //첫번째 줄에서 n의 두배+1만큼 찍으면서 다음줄에서는 -2씩 줄어들게끔 식을 짠다.
        for (j in 0 .. ((n-tempI)*2)) sb.append("*")
        //enter 처리
        sb.append("\n")
    }

    print(sb.toString())
}
/**

*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********

 */
