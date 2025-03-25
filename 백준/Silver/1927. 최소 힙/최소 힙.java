import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

public static void main(String[] args) throws IOException {
        //이분탐색
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Long>q= new PriorityQueue<>();//오름차순
        while(N-- >0){
            long num = Long.parseLong(br.readLine());
            if(num!=0){
                q.add(num);
            }else if(q.isEmpty()){
                bw.append("0\n");
            }else{
                bw.append(q.poll()+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }


}
