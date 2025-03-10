import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        //ext기준으로 뽑음 val_ext값 sort by기준
        String[] dataName ={"code","date","maximum","remain"};
        int idx = Arrays.asList(dataName).indexOf(ext);
        int sortIdx=Arrays.asList(dataName).indexOf(sort_by);
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<data.length ; i++){
            if(data[i][idx] < val_ext ){
                list.add(data[i]);
            }
        }
        answer =new int[list.size()][4];
        for(int i=0;i < list.size(); i++){
            answer[i]=list.get(i);
        }
        Arrays.sort(answer, Comparator.comparingInt((int []o)->o[sortIdx]));
        return answer;
    }
}