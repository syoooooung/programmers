def solution(s):
    remove0=0
    loop=0
    while s!="1":
        preLen=len(s)
        s = s.replace('0','')
        remove0=remove0+preLen-len(s)
        s=str(bin(len(s))[2:])
        loop=loop+1
    return [loop, remove0]