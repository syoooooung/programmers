import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) { //-1 필요한 사람, 0 필요x, 1 빌려줄 수 있는 사람
        int answer = 0;
        //빌려주는거 가능한 사람 부터 filtering
        int [] gym = new int[n];
        boolean [] memo=new boolean [n];
        int reserveCnt=0;
        for(int i=0; i<lost.length; i++){
            gym[lost[i]-1]--;
        }
        for(int i=0; i<reserve.length ; i++){
            gym[reserve[i]-1]++;
            if(gym[reserve[i]-1]<=0) //빌려줄 수 없게된애는 젤큰수로 바꾸기
                reserve[i]=n+1;
        }
        if(gym[0]>=0){
            memo[0]=true;
            memo[1] = gym[0]==1 ? true:false;
        }
        for(int i=1; i<n ; i++){
            if(gym[i]>=0){
                memo[i]=true;
            }
            if(gym[i]>=1){ //빌려 줄 수 있는 사람이라면
                if(memo[i-1] && i!=n-1){ //앞사람이 체육복이 있다면
                    memo[i+1] = true; //뒷사람에게 주기
                }
                else if(i!=0){
                    memo[i-1] = true;
                }
            }
        }
        for(int i=0; i<n; i++){
            answer += memo[i]==true ? 1:0;
        }
        return answer;
    }
    
}