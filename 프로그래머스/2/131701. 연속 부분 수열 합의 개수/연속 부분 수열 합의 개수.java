import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int len = elements.length;
        Set <Integer> set = new HashSet<>();
        for(int i=0; i<len; i++){ //길이가 i
            for(int j=0; j< len; j++){ //시작 index
                int sum=0;
                int idx=j;
                for(int k=j; k<=j+i; k++){
                    idx = idx%len;
                    sum+=elements[idx];
                    idx++;
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}