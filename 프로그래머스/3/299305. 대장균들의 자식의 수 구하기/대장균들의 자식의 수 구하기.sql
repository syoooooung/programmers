-- 코드를 작성해주세요
SELECT e1.ID , count(e2.ID) as CHILD_COUNT
FROM ECOLI_DATA e1
LEFT JOIN ECOLI_DATA e2
ON e2.PARENT_ID = e1.ID
GROUP BY e1.ID
ORDER BY e1.ID
