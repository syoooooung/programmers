import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> q =new LinkedList<>();
        int prev=-1;
        for(int i: arr){
            if(prev!=i){
                q.offer(i);
                prev=i;
            }
        }
         int[] answer = new int[q.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=q.poll();
        }
        return answer;
    }
}