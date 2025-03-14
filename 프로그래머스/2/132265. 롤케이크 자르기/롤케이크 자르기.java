import java.util.*;
class Solution {
    public int solution(int[] topping) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int answer=0;
        for(int i:topping){
            map1.put(i, map1.getOrDefault(i,0)+1);
        }
        for(int i:topping){
            if(map1.get(i) == 1){
                map1.remove(i);
            }else{
                map1.put(i, map1.get(i)-1);
            }
            map2.put(i, map2.getOrDefault(i,0)+1);
            if(map1.size()==map2.size())
                answer++;
        }
        
        return answer;
    }
}