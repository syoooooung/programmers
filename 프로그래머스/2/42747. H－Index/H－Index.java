import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int h=citations.length+1;
        Integer[] cit = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(cit, Collections.reverseOrder());
        for(int i=0; i<citations.length; i--){
            h--;
            if(h!=0 &&cit[h-1]<h)
                continue;
            return h;
        }
        return h;
    }
}