def solution(food):
    ls=""
    for i in range(1,len(food)):
        ls+=str(i)* (food[i]//2)
    answer= "".join(list(ls)[::-1])
    answer =ls+"0"+answer

    return answer