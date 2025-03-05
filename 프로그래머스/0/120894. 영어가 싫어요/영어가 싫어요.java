class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] realN = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for(int i=0; i<num.length ; i++){
            if(numbers.contains(num[i])){
                numbers = numbers.replace(num[i],realN[i]);
            }

        }
        System.out.println(numbers);
        answer =Long.parseLong(numbers);
        return answer;
    }
}