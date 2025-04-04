import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        if(n==0 || n==1) {
            bw.write(n + "\n");
        }
        else{
            BigInteger[] dp=new BigInteger[n+1];
            dp[0]=BigInteger.ZERO;
            dp[1]=BigInteger.ONE;
            for(int i=2; i<n+1 ; i++){
                dp[i] = dp[i-1].add(dp[i-2]);
            }
            bw.write(dp[n]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}