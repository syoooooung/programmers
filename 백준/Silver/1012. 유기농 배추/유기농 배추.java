import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visit;
    static int M, N;
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while(T-- >0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            map = new int[N][M];
            visit= new boolean[N][M];
            int K = Integer.parseInt(st.nextToken());
            int cnt=0;
            while(K-- >0){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }
            for(int i=0; i<N ; i++){ //Y
                for(int j=0; j<M; j++){ //X
                    if(!visit[i][j] && map[i][j]==1){
                        bfs(i,j);
                        cnt++;
                    }
                }
            }
            bw.append(cnt+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    static private void bfs(int startY, int startX){
        int[] dx = {0,0,1,-1};
        int[] dy={1,-1,0,0};
        Queue<int[] > q= new LinkedList<>();
        q.offer(new int[]{startY, startX});
        visit[startY][startX]=true;
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            int cx = tmp[1];
            int cy = tmp[0];
            for(int i=0; i<4 ; i++){
                int x = cx+dx[i];
                int y = cy+ dy[i];
                if(x>=0 && x<M &&y>=0 && y<N && !visit[y][x] && map[y][x]==1){
                    visit[y][x]=true;
                    q.offer(new int[]{y,x});
                }
            }
        }
    }


}
