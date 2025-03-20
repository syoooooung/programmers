import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static int[][] apart= new int[15][15];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        buildApt();
        for(int i=0; i<N; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.append(apart[k][n]+"\n");
        }
        bw.flush();
        bw.close();

    }
    private static void buildApt(){
        for(int i=0; i<15; i++){
            for(int j=0; j<15; j++){
                if(j==0 || j==1 || i==0){
                    apart[i][j]=j;
                }else{
                    apart[i][j]=apart[i-1][j]+apart[i][j-1];
                }
            }
        } return;
    }

}