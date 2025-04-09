import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr=new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0 ; i< N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp=new int[N+1];
        int ans=0;
        for(int i=1 ; i<= N ; i++){
            dp[i]=1;
            for(int j=1; j<i; j++){
                if(arr[i-1]>arr[j-1]){
                    dp[i]=Math.max(dp[i], dp[j]+1);
                }
            }
            ans=Math.max(dp[i],ans);
        }
        System.out.println(ans);
    }
}
