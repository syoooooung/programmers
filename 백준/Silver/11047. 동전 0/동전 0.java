import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] nums = new int[N];
        for(int i=0; i<N;i++){
            nums[i] = Integer.parseInt(br.readLine());
        }
        int answer=0;
        for(int i=N-1 ; i>=0 ; i--){
            if(nums[i]<=S){
                answer+=(int)S/nums[i];
                S = S%nums[i];
            }
        }
        System.out.println(answer);

    }

}