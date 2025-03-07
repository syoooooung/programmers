class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        //자신의 기사 번호의 약수 개수 == 공격력 
        //공격력의 제한수를 넘으면 협약기관에서 정한대로 구매
        //
        for(int i=1; i<=number; i++){
            int divisor= divisor(i);
            if(divisor > limit){
                answer+=power;
            }
            else{
                answer += divisor;
            }
        }
        return answer;
    }
    static private int divisor(int num){ //약수 개수 return
        int divisorN=0;
        for(int i=1; i<= Math.sqrt(num); i++){
            if(num%i != 0){
                continue;
            }
            else if(num%i ==0 && i!=Math.sqrt(num)){
                divisorN+=2;
            }
            else{
                divisorN++;
            }
        }
        return divisorN;
    }
}