import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        String[] sqrs = {"({[","]})"};
        int[] nums=new int[3];
        Stack<Integer> st = new Stack<>(); //괄호index저장
        st.push(9);
        String nextS = s;
        boolean breakS=false;
        for(int i=0; i<s.length(); i++){ //string 길이만큼 반복
            breakS=false;
            for(char c : nextS.toCharArray()){
                boolean open = sqrs[0].contains(String.valueOf(c));
                int idx = index(c);
                if( !open && idx !=st.peek() && st.peek()%2 == 0){ 
                    st.push(idx);
                    nums[idx]++;
                }
                else if( !open && idx==st.peek() ){ 
                    st.pop();
                    nums[idx]--;
                }else if( open  ){
                    st.push(idx);
                    nums[idx]++;
                }
                else{
                    breakS=true;
                    break;
                }
                //System.out.println(st+"====");
            }
            if(!breakS &&st.size()==1 ){
                answer++;
                //System.out.println("answer plus");
            }
            st.clear(); st.push(9);
            nextS = nextS.substring(len-1,len)+nextS.substring(0,len-1); //한바퀴 돌리기
            //System.out.println("=====NEXT=====");
        }
        return answer;
    }
    static private int index(char c){
        if(c == '(' || c==')')
            return 0;
        if(c =='{' || c=='}')
            return 1;
        if(c=='[' || c==']')
            return 2;
        return -1;
    }
}