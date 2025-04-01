import java.util.*;
class Solution {
    public int solution(String s) {
        //일단 올바른지 판단은 어떻게 할거냐
        //내가 닫으려는데 내가 아닌 다른놈이 벌리고 있으면 false임
        //stack에 넣으면서 닫히면 pop해주기
        int ans=0;
        for(int i=0; i<s.length() ; i++){
            if(isValid(s))
                ans++;
            s=s.substring(s.length()-1)+s.substring(0,s.length()-1);
        }
        return ans;
    }
    static private boolean isValid(String s){
        //새로 여는거면 ㄱㄴ
        //닫을거면 1. 내가 열고있거나, 2.비어있으면안됨
        Stack<String> st = new Stack<>();
        String opens="[{("; int idx=0;
        for(int i=0; i<s.length() ; i++){
            String x = s.substring(i,i+1);
            if(opens.contains(x)){ 
                st.push(x); continue;
            }
            switch (s.charAt(i)){
                case ']':
                    idx=0;
                    break;
                case '}':
                    idx=1;
                    break;
                case ')':
                    idx=2;
                    break;
                default:
                    break;
            }
            if(st.empty() || opens.charAt(idx)!=st.peek().charAt(0)){
                return false;
            }
            st.pop();
        }
        return st.empty()?true:false;
    }
}