class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.charAt(0)=='+' || s.charAt(0)=='-'){
            String num_s= s.substring(1,s.length());
            answer = Integer.parseInt(num_s);
            answer = s.charAt(0)=='+'? answer:-answer;
        }
        else{
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}