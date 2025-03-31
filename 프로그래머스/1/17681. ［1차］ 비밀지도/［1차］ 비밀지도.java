class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n ; i++){
            String str1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            String str2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
            String ans="";
            for(int j=0; j<n;j++){
                ans+= str1.charAt(j)==str2.charAt(j) &&str1.charAt(j)=='0'? " ":"#";
            }
            answer[i]=ans;
        }
        return answer;
    }
}