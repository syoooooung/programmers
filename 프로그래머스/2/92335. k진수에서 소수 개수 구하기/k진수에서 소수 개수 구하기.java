class Solution { //p는 0을 포함하지 않음, 0이 연속으로 있는 경우 처리해줘야함
    public int solution(int n, int k) {
        int answer = 0;
        String num="";
        while(n>=k){
            num = Integer.toString(n%k)+num;
            n/=k;
        }
        num = Integer.toString(n)+num;
        String[] numInt =num.split("0");
        for(int i=0; i<numInt.length ; i++){
            if(!numInt[i].equals("") && isPrime(Long.parseLong(numInt[i])))
                answer++;
        }
        return answer;
    }
    private boolean isPrime(long num){
        if(num==1)
            return false;
        for(long i=2; i<=Math.sqrt(num); i++){
            if(num%i ==0)
                return false;
        }
        return true;
    }
}