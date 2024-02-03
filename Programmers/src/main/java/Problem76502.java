import java.util.*;

/**
 * 프로그래머스 > 괄호 회전하기
 */
class Problem76502 {
    public int solution(String s) {
        int answer = 0;

        for(int i=0; i<s.length(); i++) {
            if(isCorrect(s)) {
                answer++;
            }
            char temp = s.charAt(0);
            s = s.substring(1) + temp;
        }

        return answer;
    }

    boolean isCorrect(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                char popS = stack.pop();

                if(
                        (popS == '(' && s.charAt(i) != ')') ||
                                (popS == '[' && s.charAt(i) != ']') ||
                                (popS == '{' && s.charAt(i) != '}')
                ) return false;
            }
        }

        return stack.isEmpty();
    }
}