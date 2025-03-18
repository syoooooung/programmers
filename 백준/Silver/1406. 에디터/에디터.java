import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());
        Stack<Character> leftS=new Stack<>();
        Stack<Character> rightS=new Stack<>();
        for(int i=0; i<str.length(); i++){
            leftS.push(str.charAt(i));
        }
        for(int i=0; i<N ; i++){
            String command = br.readLine();
            char C = command.charAt(0);
            switch(C){
                case'L':
                    if(!leftS.isEmpty())
                        rightS.push(leftS.pop());
                    break;
                case 'D':
                    if(!rightS.isEmpty())
                        leftS.push(rightS.pop());
                    break;
                case 'B':
                    if(!leftS.isEmpty())
                        leftS.pop();
                    break;
                case 'P':
                    char k=command.charAt(2);
                    leftS.push(k);
                    break;
            }
        }
        while(!leftS.isEmpty())
            rightS.push(leftS.pop());
        while(!rightS.isEmpty())
            bw.write(rightS.pop());
        bw.flush();
        bw.close();
    }


}