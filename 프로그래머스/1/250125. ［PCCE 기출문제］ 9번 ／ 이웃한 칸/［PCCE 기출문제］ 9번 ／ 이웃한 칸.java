class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        for(int i=0; i<4; i++){
            if(dx[i]+w>=0 && dx[i]+w<board[0].length && dy[i]+h>=0 && dy[i]+h <board.length){
                if(board[dy[i]+h][dx[i]+w].equals(board[h][w]))
                    answer++;
            }
        }
        return answer;
    }
}