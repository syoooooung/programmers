class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int) (right-left);
        int[] answer = new int[len+1];
        long idx=left;
        for(int i=0; i<len+1; i++){
            long col = (long) (idx/n);
            long row = idx%n;
            answer[i]=(int)Math.max(col,row)+1;
            idx++;
        }
        return answer;
    }
}