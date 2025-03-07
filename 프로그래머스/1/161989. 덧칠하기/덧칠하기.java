class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        //구역을 n개로 나눔
        //1번부터 n번까지 번호 붙이기 // 롤러의 길이는 m미터
        int[] visited = new int[n];
        for(int i=0;i<section.length; i++){ //방문 배열 초기화
            visited[section[i]-1]=1;
        }
        for(int i=0; i<n-m;i++){
            if(visited[i]!=1)
                continue;
            for(int j=i; j<i+m ;j++)
                visited[j]=0;
            answer++;
        }
        for(int i=n-m ; i<n; i++){
            if(visited[i]==1){
                answer++;
                break;
            }
        }
        return answer;
    }
}