import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int N=0;
    static int K=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int [] dp = new int[300000];
        for(int i= 0 ; i<300000 ; i++){
            if(i<N){
                dp[i]=N-i;
            }else{
                dp[i]= i-N;
            }
        }
        for(int i=0; i<150000; i++){

            if(i<=N){
                dp[i+1]=Math.min(dp[i+1], dp[i]+1);
                dp[i*2]=Math.min(dp[i*2], dp[i]+1);
            }else if(i>K){
                int tmp = dp[i-1];
                dp[i-1]=Math.min(dp[i-1], dp[i]+1);
                if(dp[i-1]!= tmp)
                    i=i-2;
            }else{
                int tmp = dp[i-1];
                dp[i+1]=Math.min(dp[i+1], dp[i]+1);
                dp[i*2]=Math.min(dp[i*2], dp[i]+1);
                dp[i-1]=Math.min(dp[i-1], dp[i]+1);
                if(dp[i-1]!= tmp)
                    i=i-2;
            }
            //System.out.println("i: "+i+" "+dp[i]);

        }

        System.out.println(dp[K]);
    }



}