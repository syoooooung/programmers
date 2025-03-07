import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] can = {"aya", "ye", "woo", "ma"};
        String[] cant = {"ayaaya", "yeye", "woowoo", "mama"};
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<can.length; j++){
                if(babbling[i].contains(cant[j])){
                    babbling[i]=babbling[i].replace(cant[j],"1");
                    break;
                }
                if(babbling[i].contains(can[j])){
                    babbling[i]=babbling[i].replace(can[j],"0");
                }
            }
            babbling[i]=babbling[i].replace("0","");
            if(babbling[i].equals("")){
                answer++;
            }
        }
        return answer;
    }
}