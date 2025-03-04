import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        //그냥 원래하던대로 정렬하면 안되나?
        int len =score.length;
        int[] answer = new int[len];
        Map<Integer, Double> map = new HashMap<>();
        for(int i=0; i<len ; i++){
            map.put(i, (double)(score[i][0]+score[i][1])/2);//기존index, 평균 mapping
        }
        System.out.println("sortbefore"+map);
        List<Integer> keyset = new ArrayList<>(map.keySet());
        keyset.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return map.get(o1).compareTo(map.get(o2));
            }
        });
        
        keyset.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        int k=0, nextk=0;
        double pre=-1;
        for(Integer i: keyset){
            if(map.get(i)!=pre){
                k++;
                answer[i]= k+nextk;
                nextk=0;
                k=answer[i];
            }
            else{
                answer[i]= k;
                nextk++;
            }
            pre=map.get(i);
        }
        System.out.println("sortafter"+keyset);
        return answer;
    }

}