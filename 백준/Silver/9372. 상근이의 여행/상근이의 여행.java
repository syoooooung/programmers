import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int[][]plane;
    static boolean[] visit;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); //테스트케이스 수
        while(T-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N =Integer.parseInt(st.nextToken()); //국가 수
            int M = Integer.parseInt(st.nextToken()); //비행기 종류
            plane = new int[N+1][N+1];
            visit = new boolean[N+1];
            for(int i=0; i<M; i++){
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());//from과 to를 왕복하는 비행기다.
                int to = Integer.parseInt(st.nextToken());
                plane[from][to] = 1;
                plane[to][from]=1;
            }
            bw.append(bfs()+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    private static int bfs() {
        Queue<Integer> q =new LinkedList<>();
        q.add(1);
        visit[1]=true;
        int result=-1;
        while(!q.isEmpty()){
            result++;
            int v = q.poll();
            for(int i=1; i<=N; i++){
                if(plane[v][i] != 0 && !visit[i]){
                    visit[i]=true;
                    q.add(i);
                }
            }
        }
        return result;
    }
}
