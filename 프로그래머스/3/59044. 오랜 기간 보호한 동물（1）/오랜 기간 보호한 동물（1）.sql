-- 아직 입양 못간 동물 중
-- 오래 보호소에 있는 3마리
-- 이름, 보호시작일
SELECT i.NAME, i.DATETIME
FROM ANIMAL_INS i
LEFT JOIN ANIMAL_OUTS o
ON i.ANIMAL_ID = o.ANIMAL_ID
WHERE ISNULL(o.DATETIME)
ORDER BY i.DATETIME
LIMIT 3;