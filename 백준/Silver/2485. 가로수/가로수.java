import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visit;
    static int M, N;
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        nums[0]=Integer.parseInt(br.readLine());
        nums[1]=Integer.parseInt(br.readLine());
        int divNum= nums[1]-nums[0];
        for(int i=2; i< N ; i++){
            int num = Integer.parseInt(br.readLine());
            nums[i]=num;
            divNum = maxD(nums[i]-nums[i-1], divNum); //간격들 간의 최대공약수가 간격
        }
        int needNum = (nums[N-1]-nums[0])/divNum +1;
        needNum = needNum - N;
        System.out.println(needNum);

    }
    static private int maxD(int n1, int n2){
        int r =n1%n2;
        if(r==0)
            return n2;
        return maxD(n2, r);
    }

}
