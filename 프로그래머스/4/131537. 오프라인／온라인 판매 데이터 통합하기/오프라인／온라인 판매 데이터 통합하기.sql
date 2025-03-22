-- 22년 3월
-- 판매날짜, 상품id 유저id 판매량 출력
-- offlinesale의 유저 id는 null로 표히
(SELECT DATE_FORMAT(SALES_DATE,'%Y-%m-%d') as SALES_DATE, PRODUCT_ID, USER_ID,SALES_AMOUNT
 FROM ONLINE_SALE
 WHERE SALES_DATE like '2022-03%'
 UNION
 SELECT DATE_FORMAT(SALES_DATE,'%Y-%m-%d') as SALES_DATE, PRODUCT_ID, null as USER_ID ,SALES_AMOUNT
 FROM OFFLINE_SALE
 WHERE SALES_DATE like '2022-03%'
)
ORDER BY SALES_DATE, PRODUCT_ID,USER_ID