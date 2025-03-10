class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int open=0;
        for(int i=0; i<s.length(); i++){
            open+= s.charAt(i)=='('? 1:-1;
            if(open<0)
                return false;
        }
        answer = open==0 ? true: false;
        return answer;
    }
}