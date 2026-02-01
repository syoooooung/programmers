def solution(arr):
    answer = [arr[0]]
    pre=arr[0]
    for i in arr:
        if pre == i:
            continue
        pre=i
        answer.append(i)
    return answer