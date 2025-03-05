class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);
        int num=0;
        for(int i=1 ; i<arr.length ; i+=2){
            num = Integer.parseInt(arr[i+1]);
            String str = arr[i];
            if(str.equals("+") || str.equals("-")){
                answer += str.equals("+")? num:-num;
            }

        }
        return answer;
    }
}