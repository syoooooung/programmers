import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for(int i=0; i<N; i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr,(e1, e2)->{
            if(e1[1]==e2[1]){
                return e1[0]-e2[0];
            }else{
                return e1[1]-e2[1];
            }
        });
        for(int i=0 ; i<N ; i++){
            bw.append(arr[i][0]+" "+arr[i][1]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }


}
