import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] words= new String[N];
        Set<String> set = new HashSet<>();
        for(int i=0; i<N ; i++){
            words[i] = br.readLine();
            if(!set.add(words[i])){
                words[i]="";
            }
        }
        Arrays.sort(words,(s1,s2)->{
            if(s1.length()==s2.length()){
                return s1.compareTo(s2);
            }else{
                return s1.length()-s2.length();
            }
        });
        for(int i=0; i<N ; i++){
            if(words[i].equals(""))
                continue;
            bw.append(words[i]+"\n");
        }
        bw.flush();
        bw.close();
    }



}