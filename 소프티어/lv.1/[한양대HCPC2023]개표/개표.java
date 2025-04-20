import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String five = "++++";
        for(int i=0; i<N ; i++){
            int num = Integer.parseInt(br.readLine());
            while(num>=5){
                bw.append(five+" ");
                num-=5;
            }
            num=num%5;
            while(num-- >0){
                bw.append("|");
            }
            bw.append("\n");
            
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
