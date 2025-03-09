import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        //ingredient 1:빵 , 2:야채, 3:고기
        //각각 인덱스 0,1,2에 몇개씩 있는지 확인하기
        int answer = 0;
        Stack<Integer> hambugi = new Stack<>();
        hambugi.push(-1);
        for(int i=0; i<ingredient.length;i++){
            if(ingredient[i]==1){ //빵넣어줍니다
                if(hambugi.peek()==3){
                    answer++;
                    hambugi.pop(); hambugi.pop(); hambugi.pop();
                    continue;
                }
                hambugi.push(ingredient[i]);
            }
            else{
                if(hambugi.peek() == ingredient[i]-1){
                    hambugi.push(ingredient[i]);
                }
                else{
                    hambugi.clear();
                    hambugi.push(-1);
                }
            }
        }
        
        return answer;
    }
}