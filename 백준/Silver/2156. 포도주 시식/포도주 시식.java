import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] grapes = new int[N];
        int[] dp=new int[N+1];
        for(int i=0; i<N ; i++){
            grapes[i]=Integer.parseInt(br.readLine());
        }
        dp[1]=grapes[0];
        if(N<2){
            System.out.println(dp[N]);
            return;
        }
        dp[2]=grapes[0]+grapes[1];
        for(int i=3; i<=N; i++){
            //1. 이전꺼를 택할거면 이전꺼 + 이이이전꺼dp
            //2. 이이전꺼를 택할거면 이이전꺼 dp
            dp[i] = Math.max(dp[i-1], Math.max(grapes[i-2]+dp[i-3]+grapes[i-1],dp[i-2]+grapes[i-1])); //그냥 이전꺼 넣어주거나

        }
        Arrays.sort(dp);
        System.out.println(dp[N]);
    }
}
