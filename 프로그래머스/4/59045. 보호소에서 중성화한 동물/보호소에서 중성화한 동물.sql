-- 보호소에서 중성화 수술을 한 동물 (ins에선 중성화 안햇으나 outs에선 되어있음)
-- 아이디, 종, 이름 조회
-- 아이디 순
SELECT i.ANIMAL_ID, i.ANIMAL_TYPE, i.NAME
FROM ANIMAL_INS i
JOIN ANIMAL_OUTS o
ON i.ANIMAL_ID = o.ANIMAL_ID
WHERE (i.SEX_UPON_INTAKE like 'Intact%') and (o.SEX_UPON_OUTCOME like 'Spayed%' OR o.SEX_UPON_OUTCOME like 'Neutered%')
ORDER BY i.ANIMAL_ID