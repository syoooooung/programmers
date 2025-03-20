import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
    static int[] visit;
    static int count=1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());;
        while(N!=0){
            int cnt=0;
            for(int i=N+1 ; i<=2*N;i++){
                if(isPrime(i)){
                    cnt++;
                }
            }
            bw.append(cnt+"\n");
            N=Integer.parseInt(br.readLine());
        }
        bw.flush();
        bw.close();
    }
    private static boolean isPrime(int n){
        if(n==1)
            return false;
        for(int i=2; i<=Math.sqrt(n) ; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

}
