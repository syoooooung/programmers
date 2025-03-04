class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int w=board[0];
        int h=board[1];
        int x=0, y=0;
        for(String input:keyinput){
            if(input.equals("up") && y+1 <= h/2){
                y++;
            }
            else if(input.equals("down") && y-1 >= -h/2){
                y--;
            }
            else if(input.equals("right") && x+1 <= w/2){
                x++;
            }
            else if(input.equals("left") && x-1 >= -w/2){
                x--;
            }
        }
        answer[0]=x;
        answer[1]=y;
        return answer;
    }
}