class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1 ; i<=Math.sqrt(n);i++){
            if(n%i ==0){
                answer+=i;
                answer += i==n/i? 0: n/i;
            }
        }
        return answer;
    }
}