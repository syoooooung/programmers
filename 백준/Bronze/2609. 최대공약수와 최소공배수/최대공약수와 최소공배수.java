import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
    static int[] visit;
    static int count=1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n1=Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int result = max(n1,n2);
        System.out.println(result+"\n"+(n1*n2)/result);
        return;
    }
    private static int max(int n1, int n2){
        int r = n1%n2;
        if(r==0)
            return n2;
        return max(n2, r);
    }
}
