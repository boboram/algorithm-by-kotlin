import java.util.*;

/**
 * 섬 연결하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/42861?language=java
 * arr = [[0, 1, 5], [0, 3, 2], [0, 4, 3], [1, 4, 1], [3, 4, 10], [1, 2, 2], [2, 5, 3], [4, 5, 4]];
 */
public class Problem42861 {
    /**
     *
     * @param n
     * @param costs
     * @return
     */
    public int solution(int n, int[][] costs) {
        int answer = 0;
        //비용 기준으로 내림차순
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2]-o2[2];
            }
        });


        int[] parent = new int[n];

        for (int i=0; i<n; i++) {
            parent[i] = i;
        }

        for (int[] cost : costs) {
            if (!(checkSameParent(parent, cost[0], cost[1]))) {
                answer += cost[2];
                unionParent(parent, cost[0], cost[1]);
            }
        }


        return answer;
    }

    /**
     *
     * @param parent
     * @param x
     * @return
     */
    public int getParent(int[] parent, int x) {
        if(parent[x] == x) return x;
        else {
            return parent[x] = getParent(parent, parent[x]);
        }
    }

    /**
     * 두 섬의 상위 부모가 같은지 확인하면서 재정렬
     * @param parent
     * @param a
     * @param b
     * @return
     */
    public boolean checkSameParent(int[] parent, int a, int b) {
        return (getParent(parent, a) == getParent(parent, b));
    }

    /**
     * a,b 섬의 가장 상위 부모를 획득하여 부모가 가장 큰 섬의 부모를 적은 부모로 교체해준다.
     * checkSameParent -> getParent 를 통해서 그 아래 섬들의 상위 부모는 교체 가능하다.
     * @param parent
     * @param a
     * @param b
     * @return
     */
    public int[] unionParent(int[] parent, int a, int b) {
        a = getParent(parent, a);
        b = getParent(parent, b);

        if(a<b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }

        return parent;
    }
}