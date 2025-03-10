class Solution {
    public String solution(String s) {
        String[] nums = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(String num:nums){
            int intN = Integer.parseInt(num);
            min = Math.min(min,intN);
            max = Math.max(max, intN);
        }
        String answer = Integer.toString(min)+" "+Integer.toString(max);
        return answer;
    }
}