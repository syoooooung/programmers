import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int K;
    static long[] loops;
public static void main(String[] args) throws IOException {
        //이분탐색
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken()); //랜선의 수
        int N = Integer.parseInt(st.nextToken()); //만들어야 할 랜선수
        loops= new long[K];
        long max=0, min=0;
        for(int i=0 ; i<K ; i++){
            loops[i]=Integer.parseInt(br.readLine());
            max = Math.max(loops[i],max);
        } max++;
        while(min<max){
            long mid = (min+max)/2;
            long loopCnt = cutResult(mid);
            if(N>loopCnt){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        System.out.println(min-1);
        br.close();
    }
    static long cutResult(long h){ //나온 랜선 개수 return
        long result = 0;
        for(int i=0; i<K; i++){
            result+= loops[i]/h;
        }
        return result;
    }

}
