import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int[] nums;
    static int S;
    static int cnt=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        nums= new int[N];
        S = Integer.parseInt(st.nextToken());
        if(S==0)
            cnt--;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            nums[i]= Integer.parseInt(st.nextToken());
        }
        SUM(N-1,0);
        System.out.println(cnt);
    }
    private static void SUM(int idx, int sum){ //현재 number return
        if(idx==-1){
            if(sum==S)
                cnt++;
            return;
        }
        SUM(idx-1, sum+nums[idx]);
        SUM(idx-1, sum);
    }

}