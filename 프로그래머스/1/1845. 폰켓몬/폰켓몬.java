import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        //같은종류의 포켓몬은 같은번호
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i < len ; i++){
            set.add(nums[i]);
        }
        len = (int)len/2;
        if(len <= set.size()){
            answer= len;
        }
        else{
            answer = set.size();
        }
        return answer;
    }
}