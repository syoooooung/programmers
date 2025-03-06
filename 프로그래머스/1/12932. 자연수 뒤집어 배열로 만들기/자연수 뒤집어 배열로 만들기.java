import java.util.*;
class Solution {
    public int[] solution(long n) {
        String num=""+n;
        int len=num.length();
        int [] answer = new int[len];
        
        for(int i=0; i<len;i++){
            answer[i] = Integer.parseInt(num.substring(len-i-1,len-i) );
        }
        return answer;
    }
}