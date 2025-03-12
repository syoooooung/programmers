import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int pre=0, cnt=0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<progresses.length ; i++){
            cnt++;
            int multi = (100-progresses[i])/speeds[i];
            multi += (100-progresses[i])%speeds[i]==0? 0:1;
            if(i==0){
                pre=multi;
            }
            else if(pre< multi){ //나 아직 못 끝냈어
                q.add(cnt-1);
                cnt=1;
                pre=multi;
            }
            if(i==progresses.length-1){
                q.add(cnt);
            }
        }
        int[] answer = new int[q.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=q.peek();
            q.poll();
        }
        return answer;
    }
}