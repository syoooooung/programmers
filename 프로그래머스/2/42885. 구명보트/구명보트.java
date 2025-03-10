import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int findidx = people.length-1;
        Arrays.sort(people);
        for(int i=0 ; i<people.length ; i++){
            for(int j=findidx ; j>=i ; j--){
                if(i==j){
                    answer++;
                }
                else if(people[i]+people[j]>limit){
                    answer++;
                    findidx=j-1;
                    continue;
                }
                else {
                    findidx=j-1;
                    answer++;
                    break;
                }
                
            }
            
        }
        return answer;
    }
}