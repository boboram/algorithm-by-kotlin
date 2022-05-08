package submit

import java.io.BufferedReader
import java.io.InputStreamReader

lateinit var star:Array<Array<String>>

fun initStar(n:Int) {
    val tempN = if(n>3) n/3 else n

    star = Array(tempN, { Array<String>(tempN, {""}) })
}

fun main() {

    val n = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val sb = StringBuffer()
    var prevSqrt = 1
    var trimPos = arrayOf(2,2)
    var currentSqrt = prevSqrt*3

    initStar(n)

    for (i in 1 .. n) {
        for (j in 1 .. n) {
            var tempStar = ""

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

fun getStarByPos(i:Int, j:Int, prevSqrt:Int) :String {
    if (prevSqrt === 1) {
        return "*"
    }
    val tempI = if(i%prevSqrt === 0) prevSqrt-1 else (i%prevSqrt - 1)
    val tempJ = if(j%prevSqrt === 0) prevSqrt-1 else (j%prevSqrt - 1)

    return star[tempI][tempJ]
}