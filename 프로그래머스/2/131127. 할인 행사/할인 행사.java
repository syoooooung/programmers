import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> saveMap = new HashMap<>();
        int totalCnt=0, answer=0;
        for(int i=0 ; i<want.length ; i++){ //초기화
            saveMap.put(want[i], number[i]);
            totalCnt+=number[i];
        }
        for(int i=0; i<=discount.length-totalCnt; i++){
            HashMap<String, Integer> map = new HashMap<>(saveMap);
            for(int j=i ; j< discount.length && !map.isEmpty() ; j++){
                if(!map.containsKey(discount[j])){
                    break;
                }
                map.put(discount[j],map.get(discount[j])-1);
                if(map.get(discount[j])==0){
                    map.remove(discount[j]);
                }
            }
            if(map.isEmpty())
                answer++;
        }
        return answer;
    }
}