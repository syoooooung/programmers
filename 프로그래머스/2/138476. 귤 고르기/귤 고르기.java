import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        //서로 다른 종류가 최소
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int t:tangerine){
            map.put(t,map.getOrDefault(t,0)+1);
        }
        int[][] arr = new int[map.size()][2];
        int idx=0;
        for(int key: map.keySet()){
            arr[idx][0]=key;
            arr[idx][1]=map.get(key);
            idx++;
        }
        Arrays.sort(arr, Comparator.comparingInt((int[] o)->o[1]).reversed());
        for(int i=0; i<idx && k>0 ; i++){
            k-= arr[i][1];
            answer++;
        }
        return answer;
    }
}