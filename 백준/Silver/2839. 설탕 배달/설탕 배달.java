import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N==4 || N==7){
            System.out.println(-1);
            return;
        }
        int answer = (int)N/5;
        N %=5;
        while(N%3!=0){
            answer--;
            N+=5;
        }
        answer += N/3;
        System.out.println(answer);

    }
}