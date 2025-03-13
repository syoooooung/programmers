-- 2022 5월 1일 기준
-- 주문ID, 제품ID, 출고일자, 출고여부
-- 2022 5/1 출고 완료, 이후-> 출고대기, 미정-> 출고미정
SELECT ORDER_ID, PRODUCT_ID, DATE_FORMAT(OUT_DATE, '%Y-%m-%d') as OUT_DATE, 
    CASE WHEN OUT_DATE <= '2022-05-01' THEN '출고완료'
         WHEN OUT_DATE > '2022-05-01' THEN '출고대기'
         ELSE '출고미정'
    END as '출고여부'
FROM FOOD_ORDER
ORDER BY ORDER_ID