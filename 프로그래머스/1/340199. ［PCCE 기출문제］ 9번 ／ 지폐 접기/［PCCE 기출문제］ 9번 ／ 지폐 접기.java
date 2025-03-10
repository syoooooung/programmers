class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        //길이가 긴쪽을 반으로 접음
        //홀수 였을 때: 접은 후 소수점 이하는 버림
        int minW = Math.min(wallet[0], wallet[1]);
        int maxW = Math.max(wallet[0],wallet[1]);
        int minB = Math.min(bill[0], bill[1]);
        int maxB = Math.max(bill[0], bill[1]);
        while(minW <minB || maxW <maxB){
            int tmp=(int)maxB/2;
            maxB = Math.max(tmp, minB);
            minB = Math.min(tmp, minB);
            answer++;
        }
        return answer;
    }
}