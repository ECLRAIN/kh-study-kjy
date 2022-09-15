/*
    기존 객체지향 온라인 쇼핑몰 문제 테이블로 구현
*/

create table item(
name varchar2(18) not null unique,
type char(6) not null check(type in ('주류', '과자')),
price number not null check(price >= 0),
early char(1) check(upper(early) = 'Y'),
event char(1) check(upper(event) = 'Y')
);

insert into item(name,type,price,early,event) 
values('참이슬후레시', '주류', 1200, 'y', 'y');

insert into item(name,type,price,event) 
values('클라우드맥주', '주류', 3000, 'y');

insert into item(name, type, price, event)
values('바나나킥', '과자', 1500, 'Y');

insert into item(name, type, price, early)
values('허니버터칩', '과자', 2000, 'Y');

commit;
