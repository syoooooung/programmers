import java.util.*;
class Solution {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length; i++){
            if(chars[i]==' ')
                continue;
            char c = (char)(chars[i]+n);
            if(c>'z' && chars[i]>='a' &&chars[i]<='z'){
                c=(char)('a'+c-'z'-1);
            }else if(c>'Z' && chars[i]<='Z'){
                c=(char)('A'+c-'Z'-1);
            }
            chars[i]=c;
        }
        String answer = String.valueOf(chars);
        return answer;
    }
}