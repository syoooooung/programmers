import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        for(int i=0; i<s.length(); i++){
            int num = (int)s.charAt(i) -48;
            System.out.println(num);
            answer+=num;
        }

        return answer;
    }
}