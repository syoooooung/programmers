import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static int[]list;
    static boolean[] visit;
    static int k;
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());

        while(k!=0){
            list = new int [k];
            for(int i=0; i<k ; i++){
                list[i]=Integer.parseInt(st.nextToken());
            }
            visit = new boolean[k];
            dfs(0,0);
            bw.append("\n");
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
        }
        bw.flush();
        bw.close();
        br.close();
    }
    static private void dfs(int length, int idx)throws IOException {
        if(length == 6){
            for(int i=0 ; i<k; i++){
                if(visit[i]){
                    bw.append(list[i]+" ");
                }
            }
            //System.out.println( "idx: "+ idx+ "length: "+length);
            bw.append("\n");
            return;
        }

        for(int i= idx ; i<k ; i++){
            if(!visit[i]){
                visit[i]=true;
                //System.out.println("i: "+i+ "idx: "+ idx+ "length: "+length);
                dfs(length+1, i);
                visit[i]=false;
            }
        }
    }


}
