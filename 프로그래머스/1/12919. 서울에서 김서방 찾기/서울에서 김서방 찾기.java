class Solution {
    public String solution(String[] seoul) {
        String str="";
        for (int i=0; i< seoul.length; i++){
            if (seoul[i].equals("Kim")){
                str = "김서방은 "+i+"에 있다";
                break;
            }
        }
        return str ;
    }
}