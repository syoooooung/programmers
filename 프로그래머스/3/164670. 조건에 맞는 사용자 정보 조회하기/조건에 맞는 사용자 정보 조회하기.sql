-- 게시물 3개이상
-- 사용자 ID, 닉네임, 전체주소, 전화번호
-- 전체주소(시+ 도로명+상세) / 전화번호 하이픈형태
SELECT u.USER_ID, u.NICKNAME,CONCAT( u.CITY,' ',u.STREET_ADDRESS1,' ',u.STREET_ADDRESS2 )as '전체주소', CONCAT( SUBSTR(u.TLNO,1,3),'-',SUBSTR(u.TLNO,4,4),'-',SUBSTR(u.TLNO,8,4) )as 전화번호
FROM USED_GOODS_USER u
JOIN USED_GOODS_BOARD b
ON u.USER_ID = b.WRITER_ID
GROUP BY u.USER_ID
HAVING count(*) >= 3
ORDER BY u.USER_ID DESC
