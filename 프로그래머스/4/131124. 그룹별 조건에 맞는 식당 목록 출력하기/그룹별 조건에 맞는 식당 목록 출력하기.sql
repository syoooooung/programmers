-- 리뷰를 가장 많이 작성한 회원
-- 회원 이름 ,ㄹ ㅣ뷰텍스트, 리뷰 작성일 출력
SELECT p.MEMBER_NAME ,  r.REVIEW_TEXT, DATE_FORMAT(r.REVIEW_DATE,'%Y-%m-%d') as REVIEW_DATE
FROM MEMBER_PROFILE p
JOIN REST_REVIEW r
ON p.MEMBER_ID = r.MEMBER_ID
WHERE p.MEMBER_ID =  (
    SELECT MEMBER_ID
    FROM REST_REVIEW
    GROUP BY MEMBER_ID
    ORDER BY COUNT(MEMBER_ID) DESC limit 1
)
ORDER BY REVIEW_DATE, r.REVIEW_TEXT