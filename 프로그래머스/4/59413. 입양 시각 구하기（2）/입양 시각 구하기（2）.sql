-- 시간대별 입양
SET @H =-1;
SELECT (@H := @H+1) as HOUR ,
    (SELECT COUNT(*)
     FROM ANIMAL_OUTS
     WHERE HOUR(DATETIME) = @H) as COUNT
FROM ANIMAL_OUTS
WHERE @H <23