class Solution {
    public int solution(String s) {
        int answer = 0;
        char x =s.charAt(0);
        int samecnt=0;
        for(int i=0; i<s.length(); i++){
            if(samecnt==0){
                x= s.charAt(i);
                answer++;
            }
            char c = s.charAt(i);
            samecnt += c==x ? 1:-1;
        }
        return answer;
    }
}
