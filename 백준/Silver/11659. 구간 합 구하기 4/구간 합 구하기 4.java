import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr= new int[N];
        int[] dp=  new int [N+1];
        for(int i=0; i<N ;i++ ){
            arr[i]= Integer.parseInt(st.nextToken());
        }
        dp[1]=arr[0];
        for(int i=2; i<=N; i++){
            dp[i]=dp[i-1]+arr[i-1];
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int idx1= Integer.parseInt(st.nextToken());
            int idx2 = Integer.parseInt(st.nextToken());
            int ans = dp[idx2]-dp[idx1-1];
            bw.append(ans+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
