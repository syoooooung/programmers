def solution(n):
    # n보다 크고
    # 2진수로 변환했을때 1의 수가 같음
    answer= n+1
    nCount = bin(n)[2:].count('1')
    while True:
        binN = bin(answer)[2:]
        if(binN.count('1')==nCount):
            break
        answer+=1
    answer = int(binN,2)
    return answer