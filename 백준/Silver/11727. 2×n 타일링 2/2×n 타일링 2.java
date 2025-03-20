import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] dp=new long[1001];
        int N = Integer.parseInt(br.readLine());
        dp[1]=1; dp[2]=3;
        for(int i=3; i<=N ; i++){
            dp[i]= (dp[i-1]+dp[i-2]*2)%10007;
        }
        System.out.println(dp[N]);

    }
}