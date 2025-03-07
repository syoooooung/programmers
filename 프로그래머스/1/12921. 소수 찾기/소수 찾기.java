class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++){
            if(prime(i)){
                answer++;
            }
        }
        return answer;
    }
    static private boolean prime(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}