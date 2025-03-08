class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int minlen=101;
        for(int i=0; i<targets.length; i++){
            String str = targets[i];
            for(int j=0; j<str.length(); j++){
                char key = str.charAt(j);
                int press = findnum(keymap, key);
                if(press==101){
                    answer[i]=-1;
                    break;
                }
                answer[i] +=press;

                
            }
            
        }

        return answer;
    }
    static private int findnum(String[]keymap, char key){ //target의 c하나 찾기
        int min=101; //모든 키맵 돌려보면서 가작 작은 수 반환
        for (int i=0; i<keymap.length; i++){
            for(int j=0; j<keymap[i].length() ; j++){
                if(keymap[i].charAt(j) == key){
                    if (min>j+1){
                        min=j+1;
                    }
                }
            }
        }
        return min;
    }
}