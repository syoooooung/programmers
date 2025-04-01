import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        //두 수의 곱이 최소가 되게끔 (최대와 최소를 곱하면돼는데)
        Arrays.sort(A);
        Arrays.sort(B);
        int ans=0;
        for(int i=0; i<A.length ; i++){
            ans += A[i]*B[B.length-i-1];
        }
        return ans;
    }    
}