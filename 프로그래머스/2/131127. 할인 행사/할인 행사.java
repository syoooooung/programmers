import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<want.length ; i++){
            map.put(want[i],number[i]);
        }
        for(int i=0 ; i<=discount.length-10;i++){
            HashMap<String, Integer> tmp = new HashMap<>(map);
            boolean breakF = false;
            for(int j=i; j<i+10; j++){
                if(!tmp.containsKey(discount[j]) || tmp.get(discount[j]) -1 <0){
                    breakF=true;
                    break;
                }
                tmp.put(discount[j], tmp.get(discount[j])-1);
            }
            if(!breakF){
                answer++;
            }
        }
        return answer;
    }
}