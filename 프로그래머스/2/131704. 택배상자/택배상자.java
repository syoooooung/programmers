import java.util.*;
class Solution {
    public int solution(int[] order) {
        Stack<Integer> st = new Stack<>(); 
        st.add(-1);
        int[] belt = new int[order.length];
        int boxIdx = 1; // 현재 트럭에 넣을 순서 
        for(int i=0; i<order.length ; i++){ // 벨트 위 순서대로
            int idx= order[i];
            belt[idx-1] =i+1; 
        }

        for(int i=0; i<order.length; i++){
            if(belt[i] == boxIdx){ // 만약 지금 벨트위의 애가 트럭에 넣을 순서면
                boxIdx++; 
            } else if(st.peek() == boxIdx){ //벨트위의 애는 아니고 보조벨트 위의 애가 트럭에 넣을 순서면
                st.pop();
                boxIdx++;
                i--;
            }else{
                st.push(belt[i]);
            }
        }
        while(st.size()!= 1 && st.peek() == boxIdx){
            st.pop();
            boxIdx++;

        }
        return boxIdx -1;
    }
}