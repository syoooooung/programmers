-- 2022/08 ~ 2022/10 대여 횟수 5회 이상
-- 월별
-- 총 대여 횟수
SELECT MONTH(START_DATE) as MONTH , CAR_ID, count(*) as RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE CAR_ID in
    (
    SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE DATE_FORMAT(START_DATE,'%Y-%m') BETWEEN '2022-08' AND '2022-10'
    GROUP BY CAR_ID
    HAVING count(*)>=5
    ) AND (DATE_FORMAT(START_DATE, '%Y-%m') BETWEEN '2022-08' AND '2022-10')
GROUP BY MONTH(START_DATE) , CAR_ID 
HAVING RECORDS >0
ORDER BY MONTH ASC , CAR_ID DESC