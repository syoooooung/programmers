def solution(s):
    List = list(map(int, s.split(' ')))
    return (str(min(List))+" "+str(max(List)))