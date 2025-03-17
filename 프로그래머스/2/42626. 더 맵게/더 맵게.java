import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue <Integer> q =new PriorityQueue<>();
        for(int i:scoville){
            q.offer(i);
        }
        while(q.peek()< K){
            if(q.size()<2)
                return -1;
            int s1 = q.poll();
            int s2 = q.poll();
            q.offer(s1 + s2*2);
            answer++;
        }
        return answer;
    }
}