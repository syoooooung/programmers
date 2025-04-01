import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int ans=0, idx=people.length -1;
        Arrays.sort(people);
        //people 배열에서 태운 사람들은 -1로 하고
        for(int i=0; i<=idx ; i++){
            while(people[i]+people[idx]>limit && idx>i){
                ans++; idx--;
            }
            ans++; //루프 탈출을 햇다는건 i까지온거거나 limit 보다 작은거거나
            //i까지 왔을경우 -> ans++하고 rbeak;
            //limit보다 작을경우 -> ans++ 하고 idx-- 해주고 break;
            if(i==idx){break;}
            idx--;
        }
        return ans;
    }
}