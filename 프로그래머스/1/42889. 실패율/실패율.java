import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        double[][]result=new double[N+1][2];
        for(int i=0; i<stages.length ; i++){
            result[stages[i]-1][0]++;
        }
        double prevN=result[N][0];
        for(int i=N-1; i>=0 ; i--){
            prevN += result[i][0];
            if(prevN==0){
                result[i][0]=0;
            }else{
                result[i][0]= result[i][0]/(double)prevN;
            }
            result[i][1]=i+1;
        }
        result[N][0]=-1;
        Arrays.sort(result,(e1,e2)->{
            if(e2[0]==e1[0]){
                return (int)(e1[1]-e2[1]);
            }else{
                return Double.compare(e2[0],e1[0]);
            }
        });
        int[]ans=new int[N];
        for(int i=0; i<N; i++){
            ans[i]=(int)result[i][1];
        }
        return ans;
    }
}