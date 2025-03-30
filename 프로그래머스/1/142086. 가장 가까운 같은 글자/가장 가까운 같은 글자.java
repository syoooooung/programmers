import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> set = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(set.containsKey(s.charAt(i))){
                answer[i]=i-set.get(s.charAt(i));
                set.put(s.charAt(i), i);
            }else{
                set.put(s.charAt(i), i);
                answer[i]=-1;
            }
        }
        return answer;
    }
}