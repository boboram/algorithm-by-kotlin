import java.util.*;

class Problem42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] times = new int[progresses.length];

        for(int i=0; i<times.length; i++) {
            //(100-95)/4 = 2 가 나오도록 해야 함 
            times[i] = (int)Math.ceil((double)(100-progresses[i])/speeds[i]);
        }

        int firstDeployTime = times[0];
        Stack<Integer> stack = new Stack<>();
        stack.push(firstDeployTime);

        List<Integer> ans = new ArrayList<Integer>();
        int cnt = 0;
        for(int i=1; i<times.length; i++) {
            if(firstDeployTime >= times[i]) {
                stack.push(times[i]);
            } else {
                cnt = getCnt(stack);
                ans.add(cnt);
                firstDeployTime = times[i];
                stack.push(times[i]);
            }
            cnt = 0;
        }

        if(!stack.isEmpty()) {
            cnt = getCnt(stack);
            ans.add(cnt);
        }

        int[] answer = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            answer[i] = ans.get(i);
        }

        return answer;
    }

    public int getCnt(Stack<Integer> stack) {
        int cnt = 0;

        while(!stack.isEmpty()) {
            stack.pop();
            cnt++;
        }
        return cnt;
    }
}