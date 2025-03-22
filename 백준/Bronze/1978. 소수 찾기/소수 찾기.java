import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visit;
    static int M, N;
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt=0;
        while(N-- >0){
            int num = Integer.parseInt(st.nextToken());
            if(isPrime(num)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    static private boolean isPrime(int n){
        if(n==1)
            return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

}
