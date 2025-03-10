class Solution {
    public int solution(int n) {
        int count=Integer.bitCount(n);
        while(true){
            n++;
            int cnt =Integer.bitCount(n);
            if(cnt == count)
                break;
        }
        return n;
    }
}