import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
    static int[] visit;
    static int count=1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startVertex = Integer.parseInt(st.nextToken());

        visit=new int[vertex+1];
        for(int i=0; i<vertex+1 ; i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0; i<edge ; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            graph.get(from).add(to);
            graph.get(to).add(from);
        }
        for(int i=1 ; i<graph.size(); i++){
            Collections.sort(graph.get(i));
        }
        dfs(startVertex);
        for(int i=1; i<visit.length; i++){
            bw.append(visit[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
    private static void dfs(int v){
        visit[v]=count;
        for(int i=0; i<graph.get(v).size(); i++){
            int newV = graph.get(v).get(i);
            if(visit[newV]==0){
                count++;
                dfs(newV);
            }
        }
    }
}