import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        for(int i=1; i<words.length ; i++){
            char c = words[i-1].charAt(words[i-1].length()-1);
            if(!set.add(words[i]) || c != words[i].charAt(0)){
                return new int[]{(i)%n+1 ,(i)/n+1 };
            } 
        }
        
        return new int[]{0,0};
    }
}