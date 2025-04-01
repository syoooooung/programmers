import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String>q = new LinkedList<>();
        for(int i=0; i<cities.length ; i++){
            if(q.contains(cities[i].toUpperCase())){
                answer++;
                q.remove(cities[i].toUpperCase()); q.offer(cities[i].toUpperCase()); 
                continue;
            }else if(q.size()>=cacheSize){
                q.poll();
            }
            q.offer(cities[i].toUpperCase());
            answer+=5;
        }
        return cacheSize==0? cities.length * 5:answer;
    }
}