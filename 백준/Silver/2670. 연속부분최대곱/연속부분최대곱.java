import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] dp=new double[N]; //글자수 길이를 저장
        double[] nums=new double[N];
        for(int i=0; i<N;i++){
            nums[i]=Double.parseDouble(br.readLine());
        }
        dp=nums;
        for(int i=0; i<N ; i++){
            double num=nums[i];
            for(int j=i+1 ; j<N ; j++){
                num = num* nums[j];
                dp[i] = Math.max(dp[i], num);
            }
        }
        Arrays.sort(dp);
        double max = dp[N-1];
        System.out.println(String.format("%.3f",max));
    }
}