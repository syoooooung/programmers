import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int findidx = people.length-1;
        Arrays.sort(people);
        for(int i=0 ; i<people.length ; i++){
            for(int j=findidx ; j>=i ; j--){
                if(i==j){
                    people[i]=-1;
                    answer++;
                }
                else if(people[i]+people[j]>limit){
                    people[j]=-1;
                    answer++;
                    findidx=j-1;
                    continue;
                }
                else {
                    people[i]=-1;
                    people[j]=-1;
                    findidx=j-1;
                    answer++;
                    break;
                }
                
            }
            
        }
        return answer;
    }
}