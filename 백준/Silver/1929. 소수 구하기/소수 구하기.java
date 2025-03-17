import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //최소공배수 구하는 문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        StringBuilder sb=new StringBuilder();
        for(int i=n1; i<=n2; i++){
            if(prime(i))
                sb.append(i+"\n");
        }
        System.out.print(sb);
    }
    private static boolean prime(int n){
        if(n==1)
            return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

}