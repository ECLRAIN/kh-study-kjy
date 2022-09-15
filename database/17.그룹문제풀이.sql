DROP TABLE EXAM;
CREATE TABLE EXAM(
EXAM_ID NUMBER PRIMARY KEY,
STUDENT VARCHAR2(9) NOT NULL,
SUBJECT VARCHAR2(33) NOT NULL,
TYPE VARCHAR2(24) NOT NULL,
SCORE NUMBER(3) NOT NULL CHECK(SCORE BETWEEN 0 AND 100)
);

INSERT INTO EXAM(EXAM_ID, STUDENT, SUBJECT, TYPE, SCORE)
VALUES(1, '피카츄', '프로그래밍언어활용', '서술형', 55);
INSERT INTO EXAM(EXAM_ID, STUDENT, SUBJECT, TYPE, SCORE)
VALUES(2, '피카츄', '프로그래밍언어활용', '문제해결시나리오', 95);
INSERT INTO EXAM(EXAM_ID, STUDENT, SUBJECT, TYPE, SCORE)
VALUES(3, '피카츄', '네트워크프로그래밍구현', '서술형', 60);
INSERT INTO EXAM(EXAM_ID, STUDENT, SUBJECT, TYPE, SCORE)
VALUES(4, '피카츄', '네트워크프로그래밍구현', '평가자체크리스트', 51);
INSERT INTO EXAM(EXAM_ID, STUDENT, SUBJECT, TYPE, SCORE)
VALUES(5, '라이츄', '프로그래밍언어활용', '서술형', 80);
INSERT INTO EXAM(EXAM_ID, STUDENT, SUBJECT, TYPE, SCORE)
VALUES(6, '라이츄', '프로그래밍언어활용', '문제해결시나리오', 52);
INSERT INTO EXAM(EXAM_ID, STUDENT, SUBJECT, TYPE, SCORE)
VALUES(7, '라이츄', '네트워크프로그래밍구현', '서술형', 58);
INSERT INTO EXAM(EXAM_ID, STUDENT, SUBJECT, TYPE, SCORE)
VALUES(8, '라이츄', '네트워크프로그래밍구현', '평가자체크리스트', 80);
INSERT INTO EXAM(EXAM_ID, STUDENT, SUBJECT, TYPE, SCORE)
VALUES(9, '파이리', '프로그래밍언어활용', '서술형', 54);
INSERT INTO EXAM(EXAM_ID, STUDENT, SUBJECT, TYPE, SCORE)
VALUES(10, '파이리', '프로그래밍언어활용', '문제해결시나리오', 81);
INSERT INTO EXAM(EXAM_ID, STUDENT, SUBJECT, TYPE, SCORE)
VALUES(11, '파이리', '네트워크프로그래밍구현', '서술형', 44);
INSERT INTO EXAM(EXAM_ID, STUDENT, SUBJECT, TYPE, SCORE)
VALUES(12, '파이리', '네트워크프로그래밍구현', '평가자체크리스트', 76);
INSERT INTO EXAM(EXAM_ID, STUDENT, SUBJECT, TYPE, SCORE)
VALUES(13, '꼬부기', '프로그래밍언어활용', '서술형', 100);
INSERT INTO EXAM(EXAM_ID, STUDENT, SUBJECT, TYPE, SCORE)
VALUES(14, '꼬부기', '프로그래밍언어활용', '문제해결시나리오', 60);
INSERT INTO EXAM(EXAM_ID, STUDENT, SUBJECT, TYPE, SCORE)
VALUES(15, '꼬부기', '네트워크프로그래밍구현', '서술형', 51);
INSERT INTO EXAM(EXAM_ID, STUDENT, SUBJECT, TYPE, SCORE)
VALUES(16, '꼬부기', '네트워크프로그래밍구현', '평가자체크리스트', 72);
COMMIT;

-- 1. 학생별 평균점수를 구하여 출력				
select student, avg(score) 평균 from exam group by student
order by 평균 desc;

-- 2. 과목별 평균점수를 구하여 출력
select subject, avg(score) 평균 from exam group by subject
order by subject asc;

-- 3. 평가유형별 평균점수를 구하여 출력				
select type, avg(score) 평균 from exam group by type
order by 평균 desc;

-- 4. 학생별 최고, 최저점을 구하여 출력	
select student, max(score) 최고점, min(score) 최저점 from exam
group by student order by student asc;

-- 5. 과목별 최고, 최저점을 구하여 출력	
select subject, max(score) 최고점, min(score) 최저점 from exam
group by subject order by subject asc;

-- 6. 유형별 최고, 최저점을 구하여 출력				
select type, max(score) 최고점, min(score) 최저점 from exam
group by type order by type asc;

-- 7. 과목별 평균 60점 미만 학생의 수를 구하여 출력				
select subject, count(*) 인원수  from (
    select student, subject, avg(score) 평균 from exam
    group by student, subject having avg(score) < 60
) group by subject;

-- 8. 과목별 평균 90점 이상 학생의 수를 구하여 출력		
select subject, count(*) 인원수  from (
    select student, subject, avg(score) 평균 from exam
    group by student, subject having avg(score) >= 60
) group by subject;

-- 9. 평균이 높은 학생을 3등까지만 출력		
select * from (
    select TMP.*, rownum rn from (
        select student, avg(score) 평균 from exam
        group by student order by 평균 desc
    )TMP
) where rn between 1 and 3;
