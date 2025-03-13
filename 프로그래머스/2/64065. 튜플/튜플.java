import java.util.*;
class Solution {
    public int[] solution(String s) {
        s= s.substring(2,s.length()-2);
        String[] arr = s.split("\\},\\{");
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        //원소가 적은것부터 순서대로 정렬(콤마만 있는 상태)
        HashMap<Integer, String> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            String[] tmp = arr[i].split(",");
            for(int j=0; j<tmp.length; j++){
                if( !map.containsValue(tmp[j])){
                    map.put(i,tmp[j]);
                    break;
                }
            }
        }
        int[] answer=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            answer[i] = Integer.parseInt(map.get(i));
        }
        return answer;
    }
}