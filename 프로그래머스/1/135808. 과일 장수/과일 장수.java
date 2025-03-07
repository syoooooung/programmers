import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        //사과 점수 1~k 점
        //상자의 가장낮은 사과점수 * 사과 개수m
        //m개씩 담아서 팔고 남은건 버림
        Arrays.sort(score);
        int len = score.length;
        int answer=0;
        for(int i=len%m; i<len;i+=m){
            answer+= m*score[i];
        }
        return answer;
    }
}