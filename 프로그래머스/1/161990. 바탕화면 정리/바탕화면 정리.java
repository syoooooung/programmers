class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        //젤 왼쪽& 위 값과 에 있는 #과 젤 오른쪽& 아래 저장
        int minX=51, maxX=-1; //왼쪽 오른쪽값 저장
        int minY=51, maxY=-1; //아래쪽 위쪽 값 저장
        for(int i=0; i<wallpaper.length ;i++){
            String str =wallpaper[i];
            if(str.contains("#")){
                minY = i<minY? i:minY;
                maxY= i>maxY? i:maxY;
            }
            while(str.contains("#")){
                int idx=str.indexOf('#');
                maxX = idx>maxX? idx: maxX;
                minX= idx<minX ? idx:minX;
                str=str.replaceFirst("#",".");
            }
        }
        answer[0]=minY;
        answer[1]=minX;
        answer[2]=maxY+1;
        answer[3]=maxX+1;
        
        return answer;
    }
}