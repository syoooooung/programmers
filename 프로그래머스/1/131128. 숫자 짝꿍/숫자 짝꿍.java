import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        int[]countX =new int[10];
        int[]countY=new int[10];
        for(char x: X.toCharArray()){
            countX[x-'0']++;
        }
        for(char y: Y.toCharArray()){
            countY[y-'0']++;
        }
        StringBuilder answer = new StringBuilder();
        for(int i=9; i>=0; i--){
            int MinCount=Math.min(countX[i],countY[i]);
            while(MinCount-->0){
                answer.append(i);
            }
        }
        
        if(answer.length()==0)
            return "-1";
        if(answer.charAt(0)=='0')
            return "0";
        return answer.toString();
    }
}
