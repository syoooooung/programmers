import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        //2. 큰애를 왼쪽에 놓게 하고 왼쪽을 기준으로 정렬
        //60 20 , 2 1 , 30 21 이 되잖아
        int maxL=0, maxR=0;
        for(int i=0; i<sizes.length ; i++){
            if(sizes[i][0]<sizes[i][1]){
                int tmp=sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=tmp;
            }
            maxL=Math.max(maxL, sizes[i][0]);
            maxR=Math.max(maxR, sizes[i][1]);
        }
        return maxL*maxR;
    }
}