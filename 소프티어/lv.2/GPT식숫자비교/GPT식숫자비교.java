import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //x값이 더 작으면 작은 수
        //x값이 같을 경우 y값이 더 작으면 작은 수
        //소수점 없을 경우 -1로 초기화 해줄것
        int N= Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for(int i=0; i<N; i++){
            String num = br.readLine();
            int idx = num.indexOf(".");
            if(idx==-1){
                arr[i][0]=Integer.parseInt(num);
                arr[i][1]=-1;
            }else{
                arr[i][0]=Integer.parseInt(num.substring(0,idx));
                arr[i][1]=Integer.parseInt(num.substring(idx+1));
            }
        }
        Arrays.sort(arr,(e1,e2)->{
            if(e1[0]==e2[0]){
                return e1[1]-e2[1];
            }else{
                return e1[0]-e2[0];
            }
        });
        for(int i=0; i<N ; i++){
            if(arr[i][1]!= -1){
                bw.append(arr[i][0]+"."+arr[i][1]+"\n");
            }else{
                bw.append(arr[i][0]+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
