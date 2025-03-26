import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Long> q = new PriorityQueue<>((e1,e2)->{
            if(Math.abs(e1)==Math.abs(e2)) {
                return (int) (e1 - e2);
            }
            else{
                return(int)( Math.abs(e1)-Math.abs(e2));
            }
        });
        while(N-- >0){
            Long command = Long.parseLong(br.readLine());
            if(command!=0){
                q.add(command);
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
