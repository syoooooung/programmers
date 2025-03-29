class Solution {
    public long solution(int a, int b) {
        int start = a>b? b:a;
        int end = a>b? a:b;
        long answer = start;
        for(int i=start+1; i<=end ;i++)
            answer+=i;
        return answer;
    }
}