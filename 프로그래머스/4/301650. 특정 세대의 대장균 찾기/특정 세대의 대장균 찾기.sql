-- 3세대 대장균의 ID 출력
-- 최초 대장균 개체의 PARENT_ID는 null 값
-- select을 두 번 해야 하나
SELECT DISTINCT(e1.ID) as ID
FROM ECOLI_DATA e1
WHERE PARENT_ID in(
    SELECT DISTINCT(e2.ID)
    FROM ECOLI_DATA e2
    WHERE PARENT_ID in(
        SELECT e3.ID
        FROM ECOLI_DATA e3
        WHERE PARENT_ID is null
    )
)
ORDER BY ID