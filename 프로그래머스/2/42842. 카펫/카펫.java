import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        List <Integer> divisor=new ArrayList<>();
        for(int i=1; i<=(int)Math.sqrt(yellow); i++){
            if(yellow%i==0)
                divisor.add(i);
        } //짧은쪽이 세로
        for(int h:divisor){
            int w=yellow/h;
            if(2*w+2*h+4 == brown){
                answer[0]=w+2;
                answer[1]=h+2;
                break;
            }
                
        }
        return answer;
    }
}