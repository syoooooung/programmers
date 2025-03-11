import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int len = elements.length;
        Set <Integer> set = new HashSet<>();
        int[] sum=new int[len];
        for(int i=0; i<len ; i++){ //i는 길이
            for(int j=0; j<len ; j++){ //시작 index
                sum[j]+= elements[(j+i)%len];
                set.add(sum[j]);
            }
        }
        
        return set.size();
    }
}