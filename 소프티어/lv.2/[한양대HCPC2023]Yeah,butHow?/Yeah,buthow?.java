import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        for(int i=0 ; i<str.length() ; i++){
            char c= str.charAt(i);
            if(c=='('){
                bw.append(c);
            }else{
                String s="1)";
                s += i==str.length()-1? "":"+";
                bw.append(s);
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
