class Solution {
    public String solution(String s) {
        s=s.toUpperCase();
        String answer = "";
        int idx=0;
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            answer+= idx%2==0? c:Character.toLowerCase(c);
            idx = c!=' '?idx+1:0;
        }
        return answer;
    }
}