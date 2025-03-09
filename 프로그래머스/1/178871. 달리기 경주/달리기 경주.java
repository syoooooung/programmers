import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> info= new HashMap<>();
        for(int i =0; i<players.length ; i++){
            info.put(players[i], i);
        }
        for(int i=0; i<callings.length ; i++){
            int idx= info.get(callings[i]);
            info.replace(players[idx], info.get(players[idx])-1);
            info.replace(players[idx-1], info.get(players[idx-1])+1);
            players[idx] = players[idx-1]; 
            players[idx-1] = callings[i];
        }
        
        
        return players;
    }
}