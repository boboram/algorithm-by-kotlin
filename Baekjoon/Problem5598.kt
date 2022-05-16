import java.io.BufferedReader
import java.io.InputStreamReader

/**
================================================
 * 백준 알고리즘 | 5598 | 카이사르 암호
 * 문제 url : https://www.acmicpc.net/problem/5598
 * 변환전    A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z
 *         65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90
 * 변환후    D E F G H I J K L M N O P Q R S T U V W X Y Z A B C
 * 문제) 입력받은 카이사르 단어를 원래 단어로 고친 걸 출력하시면 된다.
 */
fun main() {
    BufferedReader(InputStreamReader(System.`in`)).readLine().map { print(if (it <= 'C') it+23 else it-3) }
}