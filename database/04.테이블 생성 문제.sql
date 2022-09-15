/*
    과거에 풀었던 객체지향 문제 중 FIFA 세계 축구 랭킹을 테이블로 구현하세요
*/
drop table soccer_ranking;
create table soccer_ranking (
rank number,
nation varchar2(30),
score number(*, 2)
);

insert into soccer_ranking(rank,nation,score) values(1, '브라질', 1828.45);
insert into soccer_ranking(rank,nation,score) values(2, '벨기에', 1823.42);
insert into soccer_ranking(rank,nation,score) values(3, '프랑스', 1786.15);
commit;

/*
    과거에 풀었던 객체지향 문제 중 통신사 요금제 정보를 테이블로 구현하세요
    
    (참고) 
    - 문자열은 char(고정) 와 varchar2(가변) 가 존재한다
    - char는 무조건 지정된 크기를 꽉 채워서 저장(무조건), 속도 매우빠름
    - varchar2는 최대 크기만 지키고 내부에서 자유롭게 사용, 효율성이 좋음
    
    - 테이블에 들어갈 값의 형태를 check 조건을 설정하여 지정할 수 있다
    - in 이라는 기호가 있으면 우측에 있는 값 중 하나에 해당된다는 뜻
*/
drop table plan;
create table plan(
telecom char(2) check(telecom in ('SK', 'KT', 'LG')),
name varchar2(60),
price number(10) check(price >= 0),
data number(10) check(data >= 0),
call number(10) check(call >= 0),
sms number(10) check(sms >= 0)
);

insert into plan(telecom,name,price,data,call,sms)
values('SK', '5G언택트 52', 52000, 200, 1000, 2000);
insert into plan(telecom,name,price,data,call,sms)
values('KT', '5G세이브', 45000, 100, 900, 1500);
insert into plan(telecom,name,price,data,call,sms)
values('LG', '5G시그니처', 130000, 500, 2000, 2500);

commit;

/*
    과거에 풀었던 객체지향 문제 중 성적 정보를 테이블로 구현하세요
    
    (참고) 
    - 오라클은 && 대신 and , || 대신 or 을 사용한다
    - 구간을 처리할 수 있는 between 연산을 따로 지원한다
    - unique 키워드를 추가하면 중복 데이터의 추가가 불가능하다
*/
drop table score;
create table score(
name varchar2(21) unique check(regexp_like(name, '^[가-힣]{2,7}$')),
--korean number(3) check(korean >= 0 and korean <= 100),
korean number(3) check(korean between 0 and 100),
english number(3) check(english between 0 and 100),
math number(3) check(math between 0 and 100)
);

insert into score(name,korean,english,math) values('피카츄', 50, 50, 50);
insert into score(name,korean,english,math) values(null,null,null,null);
select * from score;



