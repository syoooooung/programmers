class Solution {
    public long solution(int n) {
        long[] dp= new long[n+2];
        dp[1]=1;dp[2]=2;
        for(int i=3; i<=n ; i++){
            dp[i]=  (dp[i-1]+ dp[i-2])%1234567; //이전칸에서 1칸오는 경우의 수와
                //이이전 칸에서 2칸넘어오는 경우의 수가 있음   
        }
        return dp[n];
    }
    
    
}