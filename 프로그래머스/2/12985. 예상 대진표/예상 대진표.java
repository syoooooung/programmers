class Solution
{
    public int solution(int n, int a, int b)
    {
        int min = a<b? a:b;
        int max = a<b? b:a;
        //가각 1을 더해서 2로 나눈거로 올라가게됨
        int answer=1;
        while(min+1!=max || max%2!=0){
            min= (min+1)/2;
            max = (max+1)/2;
            answer++;
        }
        return answer;
    }
}