import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        Stack<Integer> right = new Stack<>();
        for(int i=1; i<food.length; i++){
            int n= food[i]/2;
            while(n-- >0){
                answer += i;
                right.push(i);
            }
        }
        answer+="0";
        while(!right.empty()){
            answer+=right.pop();
        }
        return answer;
    }
}