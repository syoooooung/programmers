class Solution {
    public int[] solution(int n, int s) {
        if(n>s){
            return new int[]{-1};
        }
        int[] answer = new int[n];
        int div = (int)s/n;
        int rest= s%n;
        for(int i=n-1; i>=0; i--){
            answer[i]=div;
            if(rest>0){
                answer[i]++;
                rest--;
            }
        }
        return answer;
    }
}