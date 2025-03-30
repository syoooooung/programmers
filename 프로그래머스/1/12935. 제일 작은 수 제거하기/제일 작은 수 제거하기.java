import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1)
            return new int[]{-1};
        int[] answer = new int[arr.length-1];
        int min=Integer.MAX_VALUE;
        for(int i: arr)
            min = Math.min(min,i);
        int idx=0;
        for(int i=0; i<arr.length-1 ; i++){
            if(arr[idx]==min){
                i--;idx++;
            }else{
                answer[i]=arr[idx++];
            }
        }
        return answer;
    }
}