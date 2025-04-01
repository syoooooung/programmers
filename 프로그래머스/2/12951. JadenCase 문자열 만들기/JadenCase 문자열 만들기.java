import java.util.*;
class Solution {
    public String solution(String s) {
        String[] str=s.split(" ",-1);
        for(int i=0; i<str.length ; i++){
            if(str[i].isEmpty())
                continue;
            str[i]= str[i].substring(0,1).toUpperCase()+str[i].substring(1).toLowerCase();
        }   
        return String.join(" ",str);
    }
}