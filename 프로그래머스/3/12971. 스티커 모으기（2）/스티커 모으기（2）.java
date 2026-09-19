class Solution {
    public int solution(int sticker[]) {
        int len = sticker.length;
        if (len == 1) return sticker[0];

        int[] dp1 = new int[len]; //첫번째꺼 선택하는 경우
        int[] dp2 = new int[len]; //첫번째꺼 선택 안 하는 경우
        dp1[0] = sticker[0]; dp1[1] = sticker[0]; //첫번째 선택
        dp2[0] = 0 ; dp2[1] = sticker[1];

        for(int i=2; i<len-1 ; i++){ 
            dp1[i] = Math.max(sticker[i]+dp1[i-2] , dp1[i-1]);
        }
        for(int i=2; i<len ; i++){
            dp2[i] = Math.max(sticker[i]+dp2[i-2], dp2[i-1]);
        }
        
        return Math.max(dp1[len-2], dp2[len-1]);
    }
}