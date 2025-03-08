class Solution {
    public int solution(String s) {
        int answer = 0;
        int x= s.charAt(0);
        int samecnt=1;
        for(int i=1; i<s.length(); i++){
            char c = s.charAt(i);
            samecnt += c==x ? 1:-1;
            if(samecnt==0){ //같은것과 다른것의 수가 같음
                answer++;
                if(i<s.length()-1)
                    x= s.charAt(i+1);
            }
        }
        if(samecnt!=0)
            answer++;
        return answer;
    }
}