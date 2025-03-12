import java.util.*;
class Solution {
    private int[][] dun;
    public int solution(int k, int[][] dungeons) {
        dun=dungeons;
        Arrays.sort(dun, Comparator.comparingInt((int[] o)-> o[0]-o[1]));
        
        int answer = count(k, dungeons.length-1);
        return answer;
    }
    private int count(int currK ,int idx ){ //현재 피로도, 현재 index
        if(idx==-1)
            return 0;
        int min = dun[idx][0];
        int waste= dun[idx][1];
        if(min <= currK){
            return Math.max(count(currK-waste, idx-1)+1, count(currK, idx-1)) ; //가거나 안가거나
        }
        else{
            return count(currK, idx-1);
        }
    }
}