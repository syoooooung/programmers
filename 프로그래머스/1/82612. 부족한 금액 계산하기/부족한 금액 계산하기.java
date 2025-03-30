class Solution {
    public long solution(int price, int money, int count) {
        long totalCost = (long) price * count * (count + 1) / 2; // 등차수열 공식 적용
        return Math.max(totalCost - money, 0); // 부족한 금액이 없으면 0 반환
    }
}