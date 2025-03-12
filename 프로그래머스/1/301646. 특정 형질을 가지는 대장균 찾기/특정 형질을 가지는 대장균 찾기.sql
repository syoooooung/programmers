-- 2번 형질은 X / 1,3번 보유
-- count
SELECT count(*) as COUNT
FROM ECOLI_DATA
WHERE ( GENOTYPE & 2 = 0 )and ((GENOTYPE & 1 =1) or (GENOTYPE & 4 =4))