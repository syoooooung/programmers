import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        for(int i=0; i<d.length && budget>=0; i++){
            budget -= d[i]; answer++;
        }
        answer = budget<0 ? answer-1:answer;
        return answer;
    }
}