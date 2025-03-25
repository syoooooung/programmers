import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int N;
    static int[] trees;
public static void main(String[] args) throws IOException {
        //이분탐색
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //나무의 수
        int M = Integer.parseInt(st.nextToken()); //가져야할 나무의 길이
        trees= new int[N];
        st =new StringTokenizer(br.readLine());
        int max=0, min=0;
        for(int i=0 ; i<N ; i++){
            trees[i]=Integer.parseInt(st.nextToken());
            max = Math.max(trees[i],max);
        } //얘네를 정렬을 한 다음에 하나씩 해볼까
        while(min<max){
            int mid = (min+max)/2;
            long sum = cutResult(mid);
            if(sum<M){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        System.out.println(min-1);
        br.close();
    }
    static long cutResult(int h){
        long result = 0;
        for(int i=0; i<N; i++){
            result+=trees[i]>h? trees[i]-h:0;
        }
        return result;
    }

}
