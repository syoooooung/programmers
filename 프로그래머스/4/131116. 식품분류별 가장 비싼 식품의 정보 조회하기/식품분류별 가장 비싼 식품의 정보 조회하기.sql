-- 식품분류별 젤비싼
-- 분류, 가격, 이름 출력
-- 분류는 {{과자, 국, 김치, 식용유}} 만 출력
SELECT f.CATEGORY, f.PRICE as MAX_PRICE, f.PRODUCT_NAME
FROM FOOD_PRODUCT f
WHERE f.PRICE in (
    SELECT max(PRICE)
    FROM FOOD_PRODUCT
    WHERE CATEGORY = f.CATEGORY AND CATEGORY in ('과자','국','김치','식용유')
    GROUP BY CATEGORY
)
ORDER BY f.PRICE DESC