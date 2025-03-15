import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int [][]visit= new int[maps.length][maps[0].length];
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        visit[0][0]=1;
        while(!q.isEmpty()){
            int[] tmp = q.remove();
            int cx = tmp[1];
            int cy= tmp[0];
            for(int i=0; i<4 ; i++){
                int x = cx+dx[i];
                int y = cy+dy[i];
                if(x>=0 && x<maps[0].length && y>=0 && y<maps.length && visit[y][x]==0 && maps[y][x]==1){
                    visit[y][x]=visit[cy][cx]+1;
                    q.add(new int[]{y,x});
                }
            }
        }
        int answer = visit[maps.length-1][maps[0].length-1];
        
        if(answer == 0){
            answer = -1;
        }
        
        return answer;
    }
}