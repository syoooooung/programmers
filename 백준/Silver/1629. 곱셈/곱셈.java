import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
        public static long C;
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        long result= pow(A,B);
        System.out.println(result);
    }
    public static long pow(long A, long exp){
        if(exp==1){
            return A%C;
        }
        long result = pow(A, exp/2);
        result = result*result%C;
        if(exp%2==1){
            return result*A%C;
        }
        return result;
    }
}
