def solution(x):
    ls = list(str(x))
    sum=0
    for i in ls:
        sum+= int(i)
    if x%sum==0:
        return True
    return False