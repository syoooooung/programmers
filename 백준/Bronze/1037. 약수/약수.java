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
        int [] arr = new int[N];
        StringTokenizer st =new StringTokenizer(br.readLine());
        for(int i=0; i<N ; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        long result=0;
        if(N%2==0){
            result = arr[0]*arr[N-1];
        }else{
            int idx=(int) N/2;
            result =(long)Math.pow( arr[idx],2);
        }
        System.out.println(result);
    }
    static private int maxD(int n1, int n2){
        int r =n1%n2;
        if(r==0)
            return n2;
        return maxD(n2, r);
    }

}
