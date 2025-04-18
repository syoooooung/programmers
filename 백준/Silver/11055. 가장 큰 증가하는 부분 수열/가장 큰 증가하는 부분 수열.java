import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int []arr= new int[N];
        int []dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<N;  i++){
            dp[i]=arr[i];
            for(int j=0; j<N ; j++){
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],dp[j]+arr[i]);
                }
            }
        }
        Arrays.sort(dp);
        System.out.println(dp[N-1]);
    }
}
