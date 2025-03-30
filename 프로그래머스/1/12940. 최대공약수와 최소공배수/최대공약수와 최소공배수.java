class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0]=maxDiv(n,m);
        answer[1]=(int) (((long)n*m)/answer[0]);
        return answer;
    }
    static private int maxDiv(int n1, int n2){
        int r = n1%n2;
        if(r==0)
            return n2;
        return maxDiv(n2, r);
    }
}