import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static boolean []isPrime=new boolean[1000001];

public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        isPrime();
        while(N != 0){
            boolean Success=false;
            for(int i=3 ; i<=(int)N/2 ; i=i+2){
                if(isPrime[i] && isPrime[N-i]){
                    bw.append(N+" = "+i+" + "+ (N-i)+"\n");
                    Success=true;
                    break;
                }
            }
            if(!Success)
                bw.append("Goldbach's conjecture is wrong.\n");
            N = Integer.parseInt(br.readLine());
        }
        bw.flush();
        bw.close();
        br.close();
    }
    static private void isPrime(){
        for(int i=2; i<=1000001 ; i++){
            boolean prime= true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime){
                isPrime[i]=true;
            }
        }
        return;
    }

}
