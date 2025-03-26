import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][]dp = new int[N][3];
        for(int i=0; i<N; i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++){
                dp[i][j]= Integer.parseInt(st.nextToken());
            }
            if(i!=0){
                dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2])+dp[i][0];
                dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2])+dp[i][1];
                dp[i][2] = Math.min(dp[i-1][0],dp[i-1][1])+dp[i][2];
            }
        }
        int result = Math.min(dp[N-1][0], Math.min(dp[N-1][1],dp[N-1][2]));
        System.out.println(result);
    }
}
