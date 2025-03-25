import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int []dp = new int[N];
        int[] arr= new int[N];
        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        dp[0]=arr[0];
        for(int i=1; i<N; i++){
            dp[i]= Math.max(arr[i], dp[i-1]+arr[i]);//나부터갈건지 이전꺼에 날 더할건지
        }
        Arrays.sort(dp);
        System.out.println(dp[N-1]);
        br.close();
    }


}
