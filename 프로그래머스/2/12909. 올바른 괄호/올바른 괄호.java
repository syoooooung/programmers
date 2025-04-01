class Solution {
    boolean solution(String s) {
        int isTrue=0;
        for(int i=0; i<s.length(); i++){
            isTrue += s.charAt(i)=='('? 1: -1;
            if(isTrue<0){
                return false;
            }
        }
        return isTrue==0? true: false;
    }
}