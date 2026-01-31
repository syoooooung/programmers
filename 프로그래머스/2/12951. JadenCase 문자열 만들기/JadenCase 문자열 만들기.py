def solution(s):
    answer = ''
    for i in s.split(' '):
        if answer =='':
            answer = i.capitalize()
        else:
            answer =answer+" "+i.capitalize()
    return answer