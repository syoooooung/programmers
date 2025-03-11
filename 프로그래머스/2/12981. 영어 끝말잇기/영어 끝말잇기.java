import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashSet<String> set = new HashSet<>();
        set.add(words[0]);
        for(int i=0; i<words.length-1; i++){
            if(words[i].charAt(words[i].length()-1) != words[i+1].charAt(0) || set.contains(words[i+1])){
                i++;
                answer[0]=i%n+1;
                answer[1]=(int)i/n +1;
                return answer;
            }
            set.add(words[i+1]);
        }
        
        return answer;
    }
}