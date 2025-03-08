import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            for(int j=0; j<index; j++){
                do{
                    if (c=='z'){
                        c='a';
                    }
                    else{
                        c++;
                    }
                }while(skip.contains(String.valueOf(c)));

    
            }
            answer+=c;
        }
        return answer;
    }
}