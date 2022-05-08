 import java.io.BufferedReader
import java.io.InputStreamReader

lateinit var star:Array<Array<String>>

fun initStar(n:Int) {
    val tempN = if(n>3) n/3 else n

    star = Array(tempN, { Array<String>(tempN, {""}) })
}

/**
 * 백준 알고리즘 | 2447 별찍기10
 * 문제 url : https://www.acmicpc.net/problem/2447
 * 풀이과정
 * 첫번째 3*3 모양을 기준으로 해서 제곱을 하는 위치의 가운데만 제외하고 이전 제곱에 대한 모양을 덧붙인다.
 */
fun main() {

    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val sb = StringBuffer()
    var prevSqrt = 1 // 3 / 3
    var trimPos = arrayOf(2,2) //currentSqrt+(3 / 3) , currentSqrt+(3 / 3)  범위 2~2 : 공백을 찍을 위치를 찾을때 사용하는 값
    var currentSqrt = prevSqrt*3 //현재 사이클에 존재하는 사이클 9->3이됨 4~6까지 공백을 둘때 사용하기 위함

    initStar(n)

    for (i in 1 .. n) {
        for (j in 1 .. n) {
            var tempStar = ""

            //현재 제곱근에서 가운데 부분만 " " 처리한다.
            if ( (i%currentSqrt in trimPos[0] .. trimPos[1]) && (j%currentSqrt in trimPos[0] .. trimPos[1])) {
                tempStar = " "
            } else {
                tempStar = getStarByPos(i,j, prevSqrt)
            }
            sb.append(tempStar)

            if ( i in 1 .. n/3 && j in 1 .. n/3) {
                star[i-1][j-1] = tempStar
            }
        }
        if( i % (3*prevSqrt) === 0) {
            prevSqrt *=3
            currentSqrt *=3
            trimPos = arrayOf( prevSqrt+1, (prevSqrt*2) )
        }
        sb.append("\n")
    }

    print(sb.toString())
}

/**
 * i : 행 인덱스
 * j 열 인덱스
 */
fun getStarByPos(i:Int, j:Int, prevSqrt:Int) :String {
    if (prevSqrt === 1) { //1이라는 것은 3*3이라는 뜻 위에서 공백처리를 하고 있기 때문에 그 이외에 것들은 *을 리턴
        return "*"
    }
    //9*9에 대한 사이클을 돌고 있을때 가운데 부분(공백처리)을 제외하고 3*3에서 찍었던 것들을 똑같이 찍어내면 되기 때문에
    //3으로 나눈 나머지를 배열의 인덱스로 찾는다.
    val tempI = if(i%prevSqrt === 0) prevSqrt-1 else (i%prevSqrt - 1)
    val tempJ = if(j%prevSqrt === 0) prevSqrt-1 else (j%prevSqrt - 1)

    return star[tempI][tempJ] //이전 사이클에서 찍었던 값을 그대로 리턴
}

/**

 ***
 * *
 ***

 *********
 * ** ** *
 *********
 ***   ***
 * *   * *
 ***   ***
 *********
 * ** ** *
 *********

 ***************************
 * ** ** ** ** ** ** ** ** *
 ***************************
 ***   ******   ******   ***
 * *   * ** *   * ** *   * *
 ***   ******   ******   ***
 ***************************
 * ** ** ** ** ** ** ** ** *
 ***************************
 *********         *********
 * ** ** *         * ** ** *
 *********         *********
 ***   ***         ***   ***
 * *   * *         * *   * *
 ***   ***         ***   ***
 *********         *********
 * ** ** *         * ** ** *
 *********         *********
 *************************** 19행
 * ** ** ** ** ** ** ** ** * 20
 *************************** 21
 ***   ******   ******   *** 22
 * *   * ** *   * ** *   * * 23
 ***   ******   ******   *** 24
 *************************** 25
 * ** ** ** ** ** ** ** ** * 26
 *************************** 27

 */
