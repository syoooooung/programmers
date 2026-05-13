import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;
        int len = A.length;
        int Bidx = B.length -1;
        for(int i=len-1 ;i>=0 ; i--){
            if(B[Bidx]>A[i]){
                answer++;
                Bidx--;
            }
        }
        
        return answer;
    }
}