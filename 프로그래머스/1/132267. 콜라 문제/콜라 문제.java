class Solution {
    public int solution(int a, int b, int n) {
        // 콜라 빈병 3개 -> 콜라 2병병
        // 빈경 20개 -> 12병 -> 2병->
        int answer = 0;
        while(n>=a){
            answer+=(n/a) *b;
            n= (n/a) *b + n%a; //n은 current 병수일뿐
        }
        return answer;
    }
}