import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int num:arr){
            if(isInt(num,divisor))
                q.add(num);
        }
        if(q.isEmpty())
            return new int[]{-1};
        int[] answer = new int[q.size()];
        for(int i=0; !q.isEmpty(); i++)
            answer[i]=q.poll();
        return answer;
    }
    private boolean isInt(int num, int div){
        double divNum = num/(double)div;
        if (divNum%1==0.0)
            return true;
        return false;
    }
}