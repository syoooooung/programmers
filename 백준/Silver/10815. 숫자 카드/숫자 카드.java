import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<Long> sangSet = new HashSet<>();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i=0; i<N;i++){
            sangSet.add(Long.parseLong(st.nextToken()));
        }
        N=Integer.parseInt(br.readLine());
        long[] cardSet= new long[N];
        st= new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){ //cardSet은 배열로 저장할것.
            cardSet[i]=Long.parseLong(st.nextToken());
        }
        for(int i=0; i<N; i++){
            if(sangSet.contains(cardSet[i])){
                sb.append("1"+" ");
            }
            else{
                sb.append("0"+" ");
            }
        }
        System.out.println(sb);
    }
}