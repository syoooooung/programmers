class Solution {
    public int solution(int[][] dots) {
        // 축과 평행하니 쉽게 가기
        // 왼쪽위부터 1,2,3,4라고 했을때 2-1(x) * 1-3(y) 해주면 됨
        // case 1 임의의 두 개의 점을 비교하여
        int w=0, h=0;
        int x=dots[0][0];
        int y= dots[0][1];
        for(int i=1; i<4 ; i++){
            if(x != dots[i][0])
                w = Math.abs(dots[i][0]-x);
            if(y != dots[i][1])
                h = Math.abs(dots[i][1]-y);
        }
        
        return w*h;
    }
}