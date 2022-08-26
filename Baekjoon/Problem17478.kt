import java.io.BufferedReader
import java.io.InputStreamReader

var input :Int = 0
val bw=System.out.bufferedWriter()


/**
 * ================================================
 * 백준 알고리즘 | 17478 | 재귀함수가 뭔가요?
 * 문제 url : https://www.acmicpc.net/problem/17478
 * 문자열 더해서 리턴하면 시간 & 메모리가 훨씬 더 커진다. bw.write 을 사용할 것
 */
fun main(){
    input = BufferedReader(InputStreamReader(System.`in`)).readLine().toInt()

    bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n")

    whatTheRecursiveFunction(input)

    bw.flush()
    bw.close()
}

fun whatTheRecursiveFunction(n:Int)
{
    val underbar = "____".repeat(input-n)

    bw.write(underbar+"\"재귀함수가 뭔가요?\"\n")
    if (n === 0) {
        bw.write(underbar+"\"재귀함수는 자기 자신을 호출하는 함수라네\"\n")
    }
    else {
        bw.write(underbar+"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n")
        bw.write(underbar+"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n")
        bw.write(underbar+"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n")
        whatTheRecursiveFunction(n-1)
    }
    bw.write(underbar+"라고 답변하였지.\n")
}