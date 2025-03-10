class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        //변환 횟수와 변환 과정에서 제거된 0의 개수.
        int pre_idx=s.length();
        while(!s.equals("1")){
            s= s.replace("0","");
            answer[1]+=pre_idx-s.length();
            answer[0]++;
            s = Integer.toBinaryString(s.length());
            pre_idx = s.length();
        }
        return answer;
    }
}