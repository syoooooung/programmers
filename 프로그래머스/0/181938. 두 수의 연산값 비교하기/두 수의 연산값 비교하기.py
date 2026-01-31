def solution(a, b):
    con = a*(10**len(str(b))) + b
    gob = 2*a*b
    if con >= gob :
        return con
    return gob