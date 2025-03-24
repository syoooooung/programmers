import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[][] dp = new int[N][N];
        for(int i=0; i<N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<=i;j++){
                dp[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int answer=dp[0][0];
        for(int i=1; i<N ; i++){
            for(int j=0; j<i+1; j++){
                if(j==0){//젤 왼쪽
                    dp[i][j]+=dp[i-1][j];
                }
                else if(j==i){
                    dp[i][j]+=dp[i-1][j-1];
                }else{
                    dp[i][j] += Math.max(dp[i-1][j], dp[i-1][j-1]);
                }
                answer = Math.max(answer, dp[i][j]);
            }
        }
        System.out.println(answer);

    }


}
