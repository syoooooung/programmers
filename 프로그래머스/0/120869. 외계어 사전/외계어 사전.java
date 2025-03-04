class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(int i=0; i<dic.length;i++){
            //String word = dic[i];
            int idx=0;
            for(int j=0; j<spell.length ; j++){
                //contain 확인할 필요가 있나
                if (dic[i].contains(spell[j])){
                    idx++;
                }
            }
            if(idx == spell.length){
                return 1;
            }
        }
        return 2;
    }
}