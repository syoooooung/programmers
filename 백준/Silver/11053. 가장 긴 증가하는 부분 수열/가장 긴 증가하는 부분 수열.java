import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int[] arr;
    static int N;
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        arr=new int[N];
        int[] dp = new int[N];
        for(int i=0; i<N; i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<N ; i++){
            dp[i]=1;
            for(int j=0; j<i ; j++){
                if(arr[j]<arr[i]){
                    dp[i]=Math.max(dp[i], dp[j]+1);
                }
            }
        }
        Arrays.sort(dp);
        System.out.println(dp[N-1]);
        br.close();
    }

}
