import java.util.*;

public class Problem42840 {
    public int[] solution(int[] answers) {
        int[] giveUpAnswer = new int[3];
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        for(int i=0; i<answers.length; i++) {
            if(answers[i] == one[i%5]) giveUpAnswer[0]++;
            if(answers[i] == two[i%8]) giveUpAnswer[1]++;
            if(answers[i] == three[i%10]) giveUpAnswer[2]++;
        }

        int max = Arrays.stream(giveUpAnswer).max().getAsInt();

        List<Integer> answ = new ArrayList<Integer>();
        for(int i=0; i<giveUpAnswer.length; i++) if(max == giveUpAnswer[i]) answ.add(i+1);

        int[] answer = new int[answ.size()];
        for(int i=0; i<answ.size(); i++){
            answer[i] = answ.get(i);
        }

        return answer;
    }
}


