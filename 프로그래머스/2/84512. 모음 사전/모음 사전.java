import java.util.*;
class Solution {
    public int solution(String word) {
        String Alph = "AEIOU";
        int [] nums = new int[5];
        int answer=0;
        nums[0]=1;
        for(int i=1; i<5 ; i++)
            nums[i]= nums[i-1]+ (int )Math.pow(5, i);
        for(int i=0; i< word.length(); i++){
            char c = word.charAt(i);
            answer += Alph.indexOf(c) * nums[4-i] +1 ;
        }
        return answer;
    }
        
        
}