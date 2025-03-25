import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //stack 사용 문제
        int N = Integer.parseInt(br.readLine());
        String command = br.readLine();
        StringTokenizer st = new StringTokenizer(command);
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3= new Stack<>();
        for(int i=9; i>=0 ; i--){
            st1.push(i); st3.push(9-i);
        }
        for(int i=0; i<N; i++){
            String str= st.nextToken();
            if(str.equals(">")){
                bw.append(Integer.toString(st3.pop()));
                while(!st2.isEmpty()){
                    bw.append(Integer.toString(st2.pop()));
                }
            }else{
                st2.push(st3.pop());
            }
        }
        bw.append(Integer.toString(st3.pop()));
        while(!st2.isEmpty()){
            bw.append(Integer.toString(st2.pop()));
        }

        bw.append("\n");
        /////////////////
        st = new StringTokenizer(command);
        for(int i=0; i<N; i++){
            String str= st.nextToken();
            if(str.equals("<")){
                bw.append(Integer.toString(st1.pop()));
                while(!st2.isEmpty()){
                    bw.append(Integer.toString(st2.pop()));
                }
            }else{
                st2.push(st1.pop());
            }
        }
        bw.append(Integer.toString(st1.pop()));
        while(!st2.isEmpty()){
            bw.append(Integer.toString(st2.pop()));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
