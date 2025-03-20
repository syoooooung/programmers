import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //2보다큰 모든 짝수는 두 소수의 합으로 나타낼 수 있음
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N ; i++){
            int num = Integer.parseInt(br.readLine());
            int prim1=0, prim2=Integer.MAX_VALUE;
            for(int j=2; j<=(int)num/2 ; j++){
                if(isPrime(j) && isPrime(num-j)){
                    if(num-2*j <prim2-prim1){
                        prim1=j;
                        prim2=num-j;
                    }
                }
            }
            bw.append(prim1 + " "+prim2+"\n");
        }
        bw.flush();
        bw.close();
    }
    private static boolean isPrime(int n){
        if(n==1)
            return false;
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

}
