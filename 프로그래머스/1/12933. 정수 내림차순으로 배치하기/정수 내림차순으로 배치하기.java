import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String s= Long.toString(n);
        char[] arr= s.toCharArray();
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
            answer+= (arr[i]-'0') * Math.pow(10,i);
        }
        return answer;
    }
}