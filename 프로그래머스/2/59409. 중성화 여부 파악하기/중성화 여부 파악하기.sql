-- 코드를 입력하세요
SELECT
    ANIMAL_ID,
    NAME,
    CASE 
        WHEN A.SEX_UPON_INTAKE LIKE '%Neutered%' OR A.SEX_UPON_INTAKE LIKE '%Spayed%' THEN 'O'
        ELSE 'X'
    END AS 중성화
FROM ANIMAL_INS A