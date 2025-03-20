import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int div= (int)N/3;
        String str="";
        if(div%2==0){
            if(N%3 ==1){
                str="CY";
            }else{
                str="SK";
            }
        }else{
            if(N%3==1){
                str="SK";
            }else{
                str="CY";
            }
        }

        System.out.println(str);
    }
}