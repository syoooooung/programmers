class Solution {
    private int[] num;
    private int t;
    public int solution(int[] numbers, int target) {
        num=numbers;
        t= target;
        int answer = calcu(numbers.length-1,0);
        
        return answer;
    }
    private int calcu(int idx, int curN){
        if(idx==-1 && curN == t){
            return 1;
        }
        else if(idx==-1){
            return 0;
        }
        return (calcu(idx-1, curN+num[idx]) + calcu(idx-1, curN-num[idx]));
    }
}