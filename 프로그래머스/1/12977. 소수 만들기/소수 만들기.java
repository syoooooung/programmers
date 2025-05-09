import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for(int i=0; i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        //소수가 되기 위해선 세 수를 더한 값이 홀수 여야 함
        //따라서 홀+홀+홀 OR 홀+짝+짝 의 경우의 수만 다루기
        for(int i=0; i<odd.size()-2; i++){
            for(int j=i+1; j<odd.size()-1; j++){
                for(int k=j+1; k<odd.size(); k++){
                    if(isPrime(odd.get(i)+ odd.get(j)+odd.get(k)))
                        answer++;
                }
            }
        }
        for(int i=0; i<odd.size(); i++){
            for(int j=0; j<even.size()-1; j++){
                for(int k=j+1; k<even.size(); k++){
                    if(isPrime(odd.get(i)+ even.get(j)+even.get(k)))
                        answer++;
                }
            }
        }
        return answer;
    }
    static private boolean isPrime(int num){
        for(int i=2; i<=Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}