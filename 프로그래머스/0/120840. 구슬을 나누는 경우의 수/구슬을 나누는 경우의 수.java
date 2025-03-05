class Solution {
    public int solution(int balls, int share) {
        //factorial을 사용하면 오버됨
        
        int answer = combi(balls, share);
        
        return answer;
    }
    private static int combi(int ball, int share){
        if(ball == share || share ==0)
            return 1;
        return combi(ball-1, share-1)+combi(ball-1, share);
    }
}