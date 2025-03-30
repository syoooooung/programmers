class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt=0;
        s= s.toUpperCase();
        for(char c:s.toCharArray()){
            if(c=='P'){
                cnt++;
            }else if(c=='Y'){
                cnt--;
            }
        }
        if(cnt!=0)
            answer = false;
        return answer;
    }
}