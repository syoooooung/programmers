import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[][]arr = new long[N][2];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<N-1; i++){
            arr[i][0] = Long.parseLong(st1.nextToken());
            arr[i][1]=Long.parseLong(st2.nextToken());
        }
        arr[N-1][1]=Long.parseLong(st2.nextToken());
        long min=arr[0][1];
        long answer=arr[0][1]*arr[0][0];
        for(int i=1; i<N-1 ; i++){
            if(min>arr[i][1]){ //현 위치가 이전꺼보다 더 비싸면
                //이전꺼에서 다 충전하도록
                min = arr[i][1];
            }
            answer+=min*arr[i][0];
        }
        System.out.println(answer);
        br.close();
    }


}
