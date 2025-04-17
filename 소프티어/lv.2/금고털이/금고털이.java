import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        //최대 70 -> 140 채우고 나머지 30 을 넣으면 170 인거네
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int bag = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int ans=0;
        int[][] arr =new int[N][2];
        for(int i=0; i<N ; i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (e1,e2)->{
            if(e1[1]==e2[1]){
                return e2[0]-e1[0];
            }else{
                return e2[1]-e1[1];
            }
        });
        for(int i=0; bag>0&& i<N ; i++){
            if(bag-arr[i][0]<0){
                ans += bag*arr[i][1];
            }else{
                ans+= arr[i][0]*arr[i][1];
            }
            bag-=arr[i][0];
        }
        System.out.println(ans);
    }
}
