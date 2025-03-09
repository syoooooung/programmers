class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int width = park[0].length();
        int height = park.length;
        int currX=0, currY=0;
        for(int i=0; i<park.length ; i++){
            if(!park[i].contains("S"))
                continue;
            currY=i;
            currX=park[i].indexOf("S");
            break;
        }
        System.out.println(currX +" "+currY);
        for(int i=0; i<routes.length ; i++){
            String[] route = routes[i].split(" ");
            int dist = Integer.parseInt(route[1]);
            boolean breakC = false;
            if(route[0].equals("E")&& currX+dist< width){
                for(int j=currX; j<=currX+dist ; j++){
                    if(park[currY].charAt(j)=='X'){
                        breakC=true;
                        break;
                    }
                }
                if(!breakC){
                    currX+=dist;
                }
            }
            else if(route[0].equals("W") && currX-dist>=0){
                for(int j=currX-dist; j<currX ; j++){
                    if(park[currY].charAt(j)=='X'){
                        breakC=true;
                        break;
                    }
                }
                if(!breakC){
                    currX-=dist;
                }
            }
            else if(route[0].equals("N") && currY-dist>=0){
                for(int j=currY-dist ; j<currY ; j++){
                    if(park[j].charAt(currX)=='X'){
                        breakC=true;
                        break;
                    }
                }
                if(!breakC){
                    currY-=dist;
                }
            }
            else if(route[0].equals("S") && currY+dist<height){
                for(int j=currY ; j<=currY+dist; j++){
                    if(park[j].charAt(currX)=='X'){
                        breakC=true;
                        break;
                    }
                }
                if(!breakC){
                    currY+=dist;
                }
            }
            System.out.println(currX +" "+currY);
            
        }
        answer[0]=currY;
        answer[1]=currX;
        return answer;
    }
}