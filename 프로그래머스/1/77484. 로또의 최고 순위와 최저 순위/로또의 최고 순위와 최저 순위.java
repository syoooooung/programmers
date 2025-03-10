class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        //하나씩 다 돌리는건 비효율적이긴한데
        int canMake=0, unknown=0; //지금 맞춘 수, 0인 수
        for(int i=0; i<win_nums.length ; i++){
            for(int j=0; j<lottos.length ; j++){
                if(lottos[j] == win_nums[i]){
                    canMake++;
                }
                if(i==0 && lottos[j]==0)
                    unknown++;
            }
        }
        
        answer[1]=canMake >1? 7-canMake: 6; //이건 맞춘 수고
        answer[0] =canMake+ unknown>1? 7-canMake-unknown:6;
        
        return answer;
    }
}