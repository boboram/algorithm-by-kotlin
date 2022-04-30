import java.io.BufferedReader
import java.io.InputStreamReader

/**
  * 백준 알고리즘 | 1004 어린왕자 | 은하수 지도, 출발점, 도착점이 주어졌을 때 어린 왕자에게 필요한 최소의 행성계 진입/이탈 횟수를 구하는 프로그램을 작성
  * 문제 url : https://www.acmicpc.net/problem/1004
  * 풀이과정
  * N개의 원 안에 출발지, 도착지가 포함되는지 여부로 진입,이탈횟수를 구한다.
  * 포함여부란? 원의 중점과 출발지 or 도착지 사이의 거리를 구하고 해당 거리가 반지름보다 작다면 포함이다.
  * 출발지와 도착지 모두가 하나의 원에 포함된 경우라면 하나의 원에 있기 때문에 진입/이탈 횟수는 존재하지 않는다.
 **/
fun main(args:Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt() //케이스 횟수

    for (i in 0..(t-1)) {
        var cnt = 0

        val point = br.readLine().split(" ") //출발지, 도착지 좌표 : s_x s_y e_x e_y
        val circleCnt = br.readLine().toInt() // 원 갯수
        val circleAry = Array(circleCnt, {br.readLine().split(" ")}) // 원 정보 : x y r

        for (circle in circleAry) {
            val contains = BooleanArray(2, {false})

            //출발지와 원의 포함 여부
            if (isContains(point[0].toInt(), point[1].toInt(), circle[0].toInt(), circle[1].toInt(), circle[2].toInt()) == true) {
                contains[0] = true
            }
            //도착지와 원의 포함 여부
            if (isContains(point[2].toInt(), point[3].toInt(), circle[0].toInt(), circle[1].toInt(), circle[2].toInt()) == true) {
                contains[1] = true
            }

            if (contains.filter { it == true }.count() == 1) { //출발지와 목적지 모두가 하나의 원에 포함돼있다면 카운트하지 않는다. 오직 1개인 경우에만 카운트
                cnt++
            }
        }
        println(cnt)
    }
}

/**
 * 해당 점이 원에 포함된 여부란? 점과 원의 중점사이의 거리를 구하고 해당 거리가 원의 반지름보다 작거나 같으면? -> 포함된 것
 * 두 점 사이의 거리 = sqrt( (x1-x2)^2 + (y1-y2)^2 )
 * @param x1
 * @param y1
 * @param x2
 * @param y2
 * @param r
 * @return 포함 여부 bool 값
 */
fun isContains(x1:Int, y1:Int, x2:Int, y2:Int, r:Int):Boolean {
    val distance = Math.sqrt(Math.pow( ((x1 - x2).toDouble()), 2.0) + Math.pow((y1 - y2).toDouble(), 2.0))

    return  if (distance <= r.toDouble()) true else false
}