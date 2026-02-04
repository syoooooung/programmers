def solution(n):
    if (n==1 or n==2) :return 1
    max = n//2 +2
    answer = 0
    for i in range(1,max):
        sum=0
        for j in range(i,max):
            sum+=j
            if sum==n:
                answer+=1
                break
            elif sum>n:
                break
    
    return answer+1