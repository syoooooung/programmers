import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        while(N-- >0){
            String[] str= br.readLine().split(" ");
            int idx = str[0].indexOf('x');
            if(idx==-1){
                idx =str[0].indexOf('X');
            }
            String s = str[1].substring(idx,idx+1);
            bw.append(s.toUpperCase());
        }
        bw.flush();
        bw.close();
        br.close();
    }
