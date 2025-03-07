class Solution {
    public int[] solution(int[] answers) {
        
        int[] A1 = {1,2,3,4,5}; //5개
        int[] A2 = {2,1,2,3,2,4,2,5}; //8개
        int[] A3 =  {3,3,1,1,2,2,4,4,5,5}; //10개
        int hit1=0, hit2=0, hit3=0;
        for(int i=0; i<answers.length; i++){
            if(A1[i%5]==answers[i]){
                hit1++;
            }
            if(A2[i%8]==answers[i]){
                hit2++;
            }
            if(A3[i%10]==answers[i]){
                hit3++;
            }
        }
        int max=0;
        int idx=0;
        int[] answer = new int[3];
        if(hit1>=hit2 && hit1>=hit3){
            max=hit1;
        }
        else if(hit2>=hit3 && hit2 >=hit1){
            max=hit2;
        }
        else{
            max=hit3;
        }
        if(hit1 ==max){
            answer[idx]=1;
            idx++;
        }
        if(hit2==max){
            answer[idx]=2;
            idx++;
        }
        if(hit3==max){
            answer[idx]=3;
            idx++;
        }
        int r[]=new int[idx];
        for(int i=0; i<idx; i++){
            r[i]=answer[i];
        }
        
        return r;
    }
}