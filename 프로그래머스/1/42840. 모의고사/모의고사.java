class Solution {
    public int[] solution(int[] answers) {
        int[][] pattern={
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
        };
        int [] hit = new int[3];
        for(int i=0; i<answers.length; i++){
            for(int j=0; j<pattern.length; j++){
                if(pattern[j][i%pattern[j].length] == answers[i]){
                    hit[j]++;
                }
            }
        }
        int max = Math.max(hit[0], Math.max(hit[1], hit[2]));
        int idx=0;
        for(int i=0; i<3; i++){
            if(hit[i]==max){
                idx++;
            }
        }
        int[] answer=new int[idx];
        idx=0;
        for(int i=0; i<3; i++){
            if(hit[i]==max){
                answer[idx]=i+1;
                idx++;
            }
        }
        return answer;
    }
}