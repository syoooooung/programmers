-- 입양기록은 있는데 보호소 들어온기록은 없는
-- 동물 ID, 이름
SELECT o.ANIMAL_ID, o.NAME
FROM ANIMAL_OUTS o
WHERE  not o.ANIMAL_ID in (
    SELECT  i.ANIMAL_ID
    FROM ANIMAL_INS i
)
ORDER BY o.ANIMAL_ID