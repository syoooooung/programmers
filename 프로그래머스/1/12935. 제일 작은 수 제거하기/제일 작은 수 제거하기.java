import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1)
            return new int[]{-1};
        int[] answer = new int[arr.length-1];
        PriorityQueue<Integer>q = new PriorityQueue<>();
        for(int i:arr)
            q.offer(i);
        int min = q.poll();
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