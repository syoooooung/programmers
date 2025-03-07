class Solution {
    public String solution(int a, int b) {
        String answer = "";
        //1월 1일은 금요일일 때 a월 b일은 무슨요일?
        //2월 29일까지있음
        int total=0;
        String days[]= {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        for(int i=0; i<a ; i++){
            total+=months[i];
        }
        total+=b;
        return days[(total+4)%7];
    }
}