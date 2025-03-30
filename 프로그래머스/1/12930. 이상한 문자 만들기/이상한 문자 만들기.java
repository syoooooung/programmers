class Solution {
    public String solution(String s) {
        String answer="";
        int idx=0;
        String[] str = s.split("");
        for(String ss:str){
            answer+= idx%2==0? ss.toUpperCase():ss.toLowerCase();
            idx = ss.equals(" ")? 0:idx+1;
        }
        return answer;
    }
}