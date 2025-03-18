-- 22/04/13
-- 취소되지 않은 흉부외가
-- 진료예약번호, 환자이름, 환자번호, 진료과코드, 의사이름, 진료예약일시 출력
SELECT a.APNT_NO,t.PT_NAME, t.PT_NO, d.MCDP_CD, d.DR_NAME, a.APNT_YMD
FROM APPOINTMENT a
JOIN DOCTOR d
ON d.DR_ID = a.MDDR_ID and d.MCDP_CD='CS'
JOIN PATIENT t
ON t.PT_NO = a.PT_NO
WHERE DATE_FORMAT(a.APNT_YMD, '%Y-%m-%d') = '2022-04-13' and a.APNT_CNCL_YN ='N'
ORDER BY a.APNT_YMD