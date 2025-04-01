import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List <Integer> list = new ArrayList<>();
        int time= (100-progresses[0])/speeds[0];
        time += (100-progresses[0])%speeds[0] != 0 ? 1:0;
        int num=1;
        for(int i=1; i<progresses.length ; i++){
            if(progresses[i]+ speeds[i]*time >=100){
                num++;
            }else{
                list.add(num);
                time=(100-progresses[i])/speeds[i];
                time += (100-progresses[i])%speeds[i] != 0 ? 1:0;
                num=1;
            }
        }list.add(num);
        int []ans = list.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}