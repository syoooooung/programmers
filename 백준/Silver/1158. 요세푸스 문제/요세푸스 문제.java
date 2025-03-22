import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append("<");
        List<Integer> list = new ArrayList<>();
        StringTokenizer st =new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        for(int i=1; i<=N ; i++){
            list.add(i);
        }
        int idx=0;
        while(N-- >0){
            if(list.size()>idx+K-1){
                idx=idx+K-1;
            } else{
                // idx : 0 1 2 뽑아야 하는 idx =2 -> K==6 k-1 % sizeof lsit
                idx = (idx+K-1)%list.size();
            }
            int num = list.get(idx);
            list.remove(idx);
            if(!list.isEmpty()){
                bw.append(num+", ");
            }else{
                bw.append(num+">");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }


}
