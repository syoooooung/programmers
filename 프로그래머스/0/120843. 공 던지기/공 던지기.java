import java.util.*;
class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int len = numbers.length;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int next=0;
        while (!set.contains(next+1)){ //저장하려는 값이 이미 존재한다면 종료 
            set.add(numbers[next]);
            if(next+2 < len){
                next +=2;
            }
            else{
                next= ((next+1)%len==0) ? 1:0;
            }
            
        }
        System.out.println(set);
        Iterator it = set.iterator();
        int setlen = set.size();
        for(int i=0; i<(int)((k-1)%setlen)+1 ;i++){
            Integer tmp = (Integer) it.next();
            System.out.println(tmp);
            answer = tmp.intValue();
        }
        
        return answer;
    }
}