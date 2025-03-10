class Solution {
    public String solution(String s) {
        String answer = "";
        String arr[]=s.split(" ",-1);
        for(int i=0; i<arr.length;i++){
            if(arr[i].isEmpty()){
                continue;
            }
            String a = arr[i].substring(0,1).toUpperCase();
            String b= arr[i].substring(1).toLowerCase();
            arr[i]=a+b;
        }
        answer=String.join(" ",arr);
        return answer;
    }
        
}