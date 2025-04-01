class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer=new int[(int)(right-left+1)];
        long idx =left;
        for(int i=0; i<right-left+1 ; idx++){
            answer[i++] =(int)( idx%n > idx/n ? idx%n +1 : idx/n+1);
        }
        return answer;
    }
}