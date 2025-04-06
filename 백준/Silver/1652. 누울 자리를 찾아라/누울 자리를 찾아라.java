import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N==1){
            System.out.println("0 0");
            return;
        }
        String[] arr=new String[N];
        for(int i=0; i<N; i++){
            arr[i]=br.readLine();
        }
        int ansH=0, ansW=0;

        for(int i=0; i<N; i++){
            boolean seqH=false,seqW=false; //이미 ++ 해줬으면 true 변환하기
            for(int j=1; j<N; j++){
                if(arr[i].charAt(j)=='X'){
                    seqW=false;
                }
                if(arr[j].charAt(i)=='X'){
                    seqH=false;
                }
                if(arr[i].charAt(j-1)=='.' && arr[i].charAt(j)=='.'&&!seqW){
                    ansW++;
                    seqW=true;
                }
                if(arr[j-1].charAt(i)=='.' && arr[j].charAt(i)=='.'&& !seqH){
                    ansH++;
                    seqH=true;
                }
            }
        }
        System.out.println(ansW+" "+ansH);
    }
}
