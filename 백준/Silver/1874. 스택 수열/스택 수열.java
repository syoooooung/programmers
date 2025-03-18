import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        int putNum=1;
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            for(; putNum<=num ; putNum++){
                st.push(putNum);
                sb.append("+\n");
            }
            if(st.peek()==num){
                st.pop();
                sb.append("-\n");
            }else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }

}