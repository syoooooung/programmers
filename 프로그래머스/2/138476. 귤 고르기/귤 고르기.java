import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        //종류가 최소가 되도록 k개를 한상자에 담기
        int ans=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:tangerine){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        List<Integer> list= new ArrayList<>(map.keySet());
        list.sort((e1,e2)->map.get(e2)-map.get(e1));
        for(int i=0; k>0 ; i++){
            k-=map.get(list.get(i));
            ans++;
        }
        return ans;
    }
}