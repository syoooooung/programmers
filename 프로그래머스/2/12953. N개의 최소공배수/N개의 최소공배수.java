import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        HashMap<Integer, Integer>map = new HashMap<>();//그 수와 최대필요수
        for(int i=0; i<arr.length;i++){
            int num = arr[i];
            //인수 저장
            for(int j=2; j<=arr[i] ; j++){
                int count=0;
                while(num%j==0){
                    count++;
                    num/=j;
                }
                count = Math.max(count, map.getOrDefault(j,0));
                if(count!=0)
                    map.put(j,count);
            }
        }
        for(int n: map.keySet()){
            answer= answer* ((int)Math.pow(n, map.get(n)));
        }
        return answer;
    }
}