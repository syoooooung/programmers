import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while(T-- >0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); //문서개수
            int M = Integer.parseInt(st.nextToken()); //궁금한 문서 현재 index
            PriorityQueue<Integer> priQ = new PriorityQueue<>(Collections.reverseOrder());
            Queue<Integer> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            int answer=1;
            for(int i=0; i<N; i++){
                int num =Integer.parseInt(st.nextToken());
                priQ.offer(num);
                q.offer(num);
            }
            while(!q.isEmpty()){
                if(priQ.peek() != q.peek()){
                    int poll = q.poll();
                    q.offer(poll);
                    M = M >0 ? M-1:q.size()-1;
                }else{
                    priQ.poll();
                    q.poll();
                    if(M==0){
                        break;
                    }else{
                        M = M >0 ? M-1:q.size()-1;
                        answer++;
                    }
                }
            }
            bw.append(answer+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }


}
