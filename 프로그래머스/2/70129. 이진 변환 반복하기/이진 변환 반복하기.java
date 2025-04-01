class Solution {
    public int[] solution(String s) {
        int zeroCnt=0;
        int loopCnt=0;
        for(; s.length()!=1;loopCnt++){
            int preLen = s.length();
            s= s.replaceAll("0","");
            zeroCnt += preLen- s.length();
            s = Integer.toBinaryString(s.length());
        }
        return new int[]{loopCnt, zeroCnt};
    }
}