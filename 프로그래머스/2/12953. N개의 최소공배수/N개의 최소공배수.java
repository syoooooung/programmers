import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int result = arr[0];
        for(int i=1; i<arr.length ; i++){
            result=(int) ((long)(result*arr[i])/lcm(result,arr[i]));
        }
        return result;
    }
    static private int lcm(int n1, int n2){
        int r= n1%n2;
        if(r==0)
            return n2;
        return lcm(n2, r);
    }
}