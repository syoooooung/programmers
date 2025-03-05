import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int longest=0;
        Set<Integer>set = new HashSet<>();
        longest = (sides[0]>=sides[1])? sides[0]:sides[1];
        for(int i=longest; i<sides[0]+sides[1] ; i++){
            set.add(i);
        } //c가 제일 길 경우 B보단 길면서 A+B보단 작아야함
        for(int i=Math.abs(sides[0]-sides[1])+1; i<=longest; i++){
            set.add(i);
        } //B가 제일 길 경우
        answer=set.size();
        return answer;
    }
}