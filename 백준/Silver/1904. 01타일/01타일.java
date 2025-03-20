import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] dp = new int[N+2];
        dp[1]=1;
        dp[2]=2;
        //1 -> 1
        //2 -> 00 11
        //3 -> 000 001 100  (i-2에는 00을 붙일 수 있고 i-1에는 1을 붙일수 있으니 i-2와 i-1을 더해주면 된다.)
        //4 -> 0000 0011 1100 1001 1111
        for(int i=3; i<=N; i++){
            dp[i]=(dp[i-2]+dp[i-1])%15746;
        }
        System.out.println(dp[N]);
    }

}
