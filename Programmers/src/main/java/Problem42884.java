import java.util.*;

/**
 * 단속카메라
 * https://school.programmers.co.kr/learn/courses/30/lessons/42884?language=java
 */
public class Problem42884 {
    public int solution(int[][] routes) {

        //진출지점 기준으로 내림자순
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });

        int answer = 1;
        int camera = routes[0][1];

        for(int i=1; i<routes.length; i++) {
            if( ! ( routes[i][0] <= camera && camera <= routes[i][1] ) ) {
                camera = routes[i][1];
                answer++;
            }
        }

        return answer;
    }
}