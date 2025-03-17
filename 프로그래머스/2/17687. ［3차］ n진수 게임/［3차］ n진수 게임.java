class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String game ="";
        for(int i=0; game.length()<=t*m ; i++){
            game+=Integer.toString(i,n);
        }
        for(int i=p-1; answer.length() <t; i=i+m){
            answer += Character.toString(game.charAt(i));
        }
        
        
        return answer.toUpperCase();
    }
}