SELECT DISTINCT B.ID, B.EMAIL, B.FIRST_NAME, B.LAST_NAME
FROM SKILLCODES A
JOIN DEVELOPERS B
ON (A.CODE & B.SKILL_CODE) > 0
WHERE NAME = 'Python' OR NAME = 'C#'
ORDER BY B.ID