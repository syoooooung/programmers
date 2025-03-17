import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int [prices.length];
        Stack<Integer> st = new Stack<>(); //index값 넣어준다.
        st.push(0);
        for(int i=1; i<prices.length ; i++){
            while(!st.empty()&&prices[st.peek()] > prices[i]){
                answer[st.peek()]= i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        while(!st.empty()){
            answer[st.peek()] = prices.length - st.peek()-1;
            st.pop();
        }
        return answer;
    }
}