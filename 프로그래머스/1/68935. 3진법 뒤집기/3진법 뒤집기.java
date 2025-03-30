class Solution {
    public int solution(int n) {
        int answer = 0;
        String str3=Integer.toString(n,3);
        int len =str3.length();
        for(int i=0; i< len; i++){
            int num = str3.charAt(i)-'0';
            answer += num*Math.pow(3,i);
        }
        return answer;
    }
}