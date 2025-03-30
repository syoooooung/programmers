class Solution {
    public int solution(int num) {
        int answer = 0;
        long n= (long)num;
        while(answer!=500 && n!=1){
            if(n%2==0){
                n=n/2;
            }else{
                n = n*3 +1;
            }
            answer++;
        }
        if(n!=1)
            return -1;
        return answer;
    }
}