import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> st = new Stack<>(); //index를 저장해줌
        st.push(0);
        for(int i=1; i<numbers.length ; i++){
            while(!st.empty() && numbers[st.peek()] < numbers[i]){
                answer[st.pop()] = numbers[i];
            }
            st.push(i);
        }
        while(!st.empty()){
            answer[st.pop()]=-1;
        }
        return answer;
    }
}