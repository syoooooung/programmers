import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        Queue<Integer> q = new LinkedList<>();
        int[]dist = new int[y+1];
        Arrays.fill(dist,-1);
        dist[x]=0;
        q.offer(x);
        
        while(!q.isEmpty()){
            int curr = q.poll();
            int[] next = {curr+n, curr*2, curr*3};
            for(int nextN:next){
                if(nextN<=y && dist[nextN]==-1){
                    dist[nextN] = dist[curr]+1;
                    q.offer(nextN);
                }
            }
        }
        return dist[y];
    }
}