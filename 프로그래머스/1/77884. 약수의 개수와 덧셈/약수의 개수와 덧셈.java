class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left ; i<=right ; i++){
            answer += isEven(i) ? i: -i;
        }
        return answer;
    }
    private static boolean isEven(int num){
        double div = Math.sqrt(num);
        if(div%1==0)
            return false;
        return true;
    }
}