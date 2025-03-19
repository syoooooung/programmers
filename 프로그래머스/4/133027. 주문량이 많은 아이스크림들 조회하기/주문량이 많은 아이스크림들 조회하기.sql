-- 7월 아이스크림 총주문량
-- + 상반기 아이스크림 총 주문량
-- 상위 3개의 맛 출력
SELECT f.FLAVOR
FROM FIRST_HALF f
JOIN JULY j
ON f.FLAVOR = j.FLAVOR
GROUP BY f.FLAVOR
ORDER BY SUM(f.TOTAL_ORDER)+SUM(j.TOTAL_ORDER) DESC limit 3;
