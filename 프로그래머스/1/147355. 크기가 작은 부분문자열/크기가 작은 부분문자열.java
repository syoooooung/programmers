class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pNum = Long.parseLong(p);
        for(int i=0; i<=t.length()-p.length();i++){
            String subStr = t.substring(i,i+p.length());
            if(Long.parseLong(subStr)<=pNum){
                answer++;
            }
        }
        return answer;
    }
}