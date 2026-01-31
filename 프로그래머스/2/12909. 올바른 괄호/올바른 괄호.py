def solution(s):
    stack=[]
    for i in s:
        if i==')' and  (len(stack)!=0):
            stack.pop()
        elif i=='(':
            stack.append(i)
        else:
            return False
    if len(stack)==0:
        return True
    return False