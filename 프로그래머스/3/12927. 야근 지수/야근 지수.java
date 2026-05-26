import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long total = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int w:works){
            total+=w;
            q.offer(w);
        }
        if (total <= n){
            return 0;
        }
        while(n>0){
            int max = q.poll();
            max--;
            n--;
            q.offer(max);
        }
        long answer=0;
        while(!q.isEmpty()){
            answer += Math.pow(q.poll(),2);
        }
        return answer;
    }
}