import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1B = Integer.parseInt(st.nextToken());
        int n1M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int n2B = Integer.parseInt(st.nextToken());
        int n2M = Integer.parseInt(st.nextToken());
        int B = n1B*n2M + n2B*n1M;
        int M = n1M * n2M;
        int div = getN(B,M);
        System.out.println(B/div+" "+M/div);
    }
    private static int getN(int n1, int n2){ //최대공약수 구하기
        int r = n1%n2;
        if(r==0)
            return n2;
        return getN(n2, r);
    }
}
