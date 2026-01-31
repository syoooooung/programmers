import math
def gcd(a,b):
    while b:
        a, b= b, a%b
    return a

def solution(number, n, m):
    gcd2=gcd(n,m)
    lcm = (n*m)/gcd2
    if number%lcm==0:
        return 1
    else:
        return 0
    
