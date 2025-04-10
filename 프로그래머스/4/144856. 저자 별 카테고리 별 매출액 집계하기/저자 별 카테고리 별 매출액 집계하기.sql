-- 22년 1월
-- 도서판매 데이터 기준
-- 저자별, 카테고리별 매출액

SELECT b.AUTHOR_ID, a.AUTHOR_NAME,b.CATEGORY, SUM(b.PRICE * s.SALES) as TOTAL_SALES
FROM BOOK b 
JOIN AUTHOR a
ON b.AUTHOR_ID = a.AUTHOR_ID
JOIN BOOK_SALES s
ON b.BOOK_ID = s.BOOK_ID
WHERE DATE_FORMAT(s.SALES_DATE,'%Y-%m')='2022-01'
GROUP BY b.AUTHOR_ID, b.CATEGORY 
ORDER BY b.AUTHOR_ID, b.CATEGORY DESC