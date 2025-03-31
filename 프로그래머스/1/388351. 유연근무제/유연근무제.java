class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int i=0; i<schedules.length ; i++){
            int hours= schedules[i]/100, min=schedules[i]%100 + 10;
            schedules[i] = min>=60? (hours+1) %24 *100 +min%60 : hours*100+min; 
        }
        for(int i=0; i<schedules.length ; i++){
            boolean isPresent=true;
            for(int j=0; j<7 ; j++){
                if( (startday+j)%7==6 || (startday+j)%7==0){
                    continue;
                }
                if(timelogs[i][j]>schedules[i]){
                    isPresent=false;
                    break;
                }
            }
            if(isPresent)
                answer++;
        }// 2259 면 2309까지 ㄱㄴ인데 2269가되어버리니까 2301도 지각처리되네
        return answer;
    }
}