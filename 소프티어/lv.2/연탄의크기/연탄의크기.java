import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st =new StringTokenizer(br.readLine());
        int []arr = new int[N];
        for(int i=0; i<N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int max=0;
        for(int i=2; i<=arr[N-1] ; i++){
            int div=0;
            for(int j=0; j<N ; j++){
                if(arr[j]%i==0){
                    div++;
                }
            }
            max = Math.max(max,div);
        }
        System.out.println(max);
        return;
    }
}
