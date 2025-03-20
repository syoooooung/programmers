import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 2원, 5원 거스름돈 -> 동전 개수 최소
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N == 1 || N == 3) {
            System.out.println("-1");
            return;
        }
        int answer = (int) N / 5;
        N = N % 5;
        while (N % 2 != 0) {
            answer--;
            N += 5;
        }
        answer += N / 2;
        System.out.println(answer);
    }

}