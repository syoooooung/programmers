def solution(k, score):
    q=[score[0]]
    answer = []
    for i in score[1:]:
        answer.append(q[0])
        if q[0] >i and len(q)>=k:
            continue
        elif len(q)>=k:
            q.pop(0)
        q.append(i)
        q.sort()
    answer.append(q[0])
    return answer