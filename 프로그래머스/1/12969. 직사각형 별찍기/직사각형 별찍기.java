import java.util.*;
import java.io.*;
class Solution {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n=  Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<m; i++){
            for(int j=0; j<n ; j++){
                bw.append("*");
            }
            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }
}