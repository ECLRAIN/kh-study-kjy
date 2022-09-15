-- 포켓몬스터 테이블 생성
create table pocket_monster (
no number(3),
name varchar2(21),
type varchar2(9)
);

-- 테이블 삭제
drop table pocket_monster;

-- 테이블 변경
alter table pocket_monster modify(type varchar2(12));

/*
    문제
    다음 요구사항에 맞는 테이블을 생성하세요
    
    - 학생(Student) 정보를 저장할 테이블
    - 학생 정보는 학년, 반, 번호, 이름
    - 학년은 3학년까지 있습니다
    - 반은 15반까지 있습니다
    - 번호는 숫자 두 자리입니다
    - 이름은 주민등록 기준에 따릅니다
    - 컬럼명은 자유롭게 작성하세요
*/

create table student (
year number(1),
room number(2),
no number(2),
name varchar2(21)
);



