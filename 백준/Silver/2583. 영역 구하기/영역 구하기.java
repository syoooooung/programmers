import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static int[][]visit;
    private static int[][]map;
    private static int M,N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        map = new int[M][N];
        visit = new int[M][N];

        for(int i=0; i<K ; i++){ //사각형 채워주기
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 =Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 =Integer.parseInt(st.nextToken());
            for(int j=x1 ; j<x2; j++){
                for(int k=y1 ; k<y2; k++){
                    map[k][j]=-1; //-1은 네모가 있는 부분
                }
            }
        }
        for(int i=0; i<M ; i++){
            for(int j=0; j<N; j++){
                if(visit[i][j]==0 && map[i][j]!=-1){
                    list.add(dfs(j,i));
                }
            }
        }
        Collections.sort(list);
        sb.append(list.size()+"\n");
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i)+" ");
        }
        System.out.println(sb);
        //dfs 함수따로 만들어서 return 되면 그 수 만큼 수가 있는거야.반복하면서 다 봐주면 될듯. if(그 위치가 0이라면 dfs 순회하도록.
    }
    private static int dfs(int startX, int startY){
        int[] dx = {0,0,1,-1};
        int[]dy = {1,-1,0,0};
        int cnt=1; //영역 크기 구해서 return 해주기
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{startY,startX});
        visit[startY][startX]=1;
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            int cx = tmp[1];
            int cy = tmp[0];
            for(int i=0; i<4; i++){
                int x = cx+dx[i];
                int y = cy+dy[i];
                if(x>=0&&x<N&&y>=0&y<M&&visit[y][x]==0 &&map[y][x]!=-1){
                    visit[y][x]=1;
                    cnt++;
                    q.add(new int[]{y,x});
                }
            }
        }
        return cnt;
    }
}