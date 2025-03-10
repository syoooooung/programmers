import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<String> st=new Stack<>();
        s+=" ";
        for(int i=0; i<s.length()-1; i++){
            String tmp=s.substring(i,i+1);
            if(!st.empty() && st.peek().equals(tmp)){
                st.pop();
            }
            else{
                st.push(s.substring(i,i+1));
            }
            
        }
        int answer= st.empty()?1:0;
        
        return answer;
    }
}