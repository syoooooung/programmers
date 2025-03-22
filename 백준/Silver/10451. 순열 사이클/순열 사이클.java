import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int[]map;
    static boolean[] visit;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while(T-- >0){
            int answer=0;
            N= Integer.parseInt(br.readLine());
            StringTokenizer st =new StringTokenizer(br.readLine());
            map=new int[N];
            visit=new boolean[N];
            for(int i=0; i<N;i++){
                int num = Integer.parseInt(st.nextToken());
                map[i]=num-1;
            }
            for(int i=0; i<N ;i++){
                if(!visit[i]){
                    bfs(i);
                    answer++;
                }
            }
            bw.append(answer+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    private static void bfs(int start){
        Queue<Integer>q = new LinkedList<>();
        q.add(start);
        visit[start]=true;
        while(!q.isEmpty()){
            int v = q.poll();
            visit[v]=true;
            if(!visit[map[v]]){
                q.add(map[v]);
            }
        }
    }

}
