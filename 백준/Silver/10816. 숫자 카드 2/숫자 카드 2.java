import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer,Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        while(N-- >0){
            int num = Integer.parseInt(st.nextToken());
            map.put(num , map.getOrDefault(num,0)+1);
        }
        int M = Integer.parseInt(br.readLine());
        st= new StringTokenizer(br.readLine());
        while(M-- >0){
            int num = Integer.parseInt(st.nextToken());
            bw.append(map.getOrDefault(num,0)+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }


}
