import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        int idx=0;
        Set<Integer>set = new HashSet<>();
        for(int i=2;i<=n;i++ ){
            while(n%i == 0){
                n/=i;
                set.add(i);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        int[] answer = new int[set.size()];
        Collections.sort(list);
        int k=0;
        for(Integer i: list){
            answer[k]=(int)(i);
            k++;
        }

        return answer;
    }
}