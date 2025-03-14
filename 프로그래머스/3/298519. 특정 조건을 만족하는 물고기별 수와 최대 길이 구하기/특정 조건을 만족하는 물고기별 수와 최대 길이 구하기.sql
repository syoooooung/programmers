-- 평균 길이가 33cm 이상
-- 물고기 종류별
-- 잡은수, 최대 길이, 종류 출력
SELECT count(*) as FISH_COUNT, max(LENGTH) as MAX_LENGTH ,FISH_TYPE
FROM FISH_INFO
GROUP BY FISH_TYPE
HAVING AVG(
    CASE WHEN LENGTH >10 then LENGTH
         ELSE 10
    END
)>=33
ORDER BY FISH_TYPE