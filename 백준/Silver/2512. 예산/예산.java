import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int []arr;
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max=0,min=0;
        for(int i=0;i< N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max,arr[i]);
        } max++;
        int M = Integer.parseInt(br.readLine());
        //이분탐색
        while(min<max){
            int mid = (min+max)/2;
            long sum = sum(mid);
            if(sum>M){
                max = mid;
            }else{
                min = mid+1;
            }
        }
        System.out.println(min-1);
    }
    static private long sum(int num){ //num==상한액
        long result=0;
        for(int i:arr){
            result += i>num ? num: i;
        }
        return result;
    }
}
