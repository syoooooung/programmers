-- 연도별 평균 미세먼지 오염도 / 평균 초미세먼지 오염도
SELECT YEAR(YM) as YEAR, ROUND(SUM(PM_VAL1) / count(*) , 2)as PM10, ROUND(SUM(PM_VAL2) / count(*) , 2) as 'PM2.5'
FROM AIR_POLLUTION
WHERE LOCATION2 ='수원'
GROUP BY YEAR
ORDER BY YEAR
