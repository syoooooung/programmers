import java.util.*;
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s =Integer.toString(x);
        int sum=0;
        for(char c :s.toCharArray()){//자릿수의 합 구하기
            sum+=c-'0';
        }
        double div = x/(double)sum;
        if(div%1!=0.0)
            answer =false;
        return answer;
    }
}