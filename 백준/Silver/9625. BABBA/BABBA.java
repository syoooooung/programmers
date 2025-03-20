import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 2원, 5원 거스름돈 -> 동전 개수 최소
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp=new int[N+1]; //글자수 길이를 저장
        if(N==1){
            System.out.println("0 1");
            return;
        }
        dp[1]=1; dp[2]=2;
        for(int i=3; i<=N; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[N-2]+" "+ dp[N-1]);

    }

}