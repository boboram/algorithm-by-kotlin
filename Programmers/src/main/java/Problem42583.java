public class Problem42583 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        int sec = 0;

        for(int i=0; i<answer.length-1; i++) {
            sec = 1;

            for(int j=i+1; j<answer.length-1; j++) {
                if(prices[i] <= prices[j]) {
                    sec++;
                } else {
                    break;
                }
            }
            answer[i] = sec;
        }

        return answer;
    }
}