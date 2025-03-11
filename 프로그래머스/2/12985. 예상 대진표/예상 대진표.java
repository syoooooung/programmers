class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        int max= a>b?a:b;
        int min= a<b? a:b;
        while(min+1 != max || min%2!=1){
            min =(int) (min+1)/2;
            max =(int) (max+1)/2;
            answer++;
        }
        

        return answer;
    }
}