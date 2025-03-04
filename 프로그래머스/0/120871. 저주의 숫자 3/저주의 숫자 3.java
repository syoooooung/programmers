class Solution {
    public int solution(int n) {
        int answer = n;
        int dontcnt=0;
        for(int i=1; i<=n; i++){
            String strN= Integer.toString(i);
            if(i%3==0 || strN.contains("3")){
                answer++;
                String str = Integer.toString(answer);
                while(answer%3==0 || str.contains("3")){
                    answer++;
                    str = Integer.toString(answer);
                }
            }
        }

        
        return answer;
    }
}