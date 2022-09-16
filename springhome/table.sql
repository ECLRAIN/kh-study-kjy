drop table member;
create table member(
member_id varchar2(20) primary key
check(regexp_like(member_id, '^[a-z0-9-_]{5,20}$')),
member_pw varchar2(16) not null
--check(regexp_like(member_pw, '^[a-zA-Z0-9!@#$]{8,16}$')),
check(
    regexp_like(member_pw, '^[a-zA-Z0-9!@#$]{8,16}$')
    and
    regexp_like(member_pw, '[a-z]')
    and
    regexp_like(member_pw, '[A-Z]')
    and
    regexp_like(member_pw, '[0-9]')
    and
    regexp_like(member_pw, '[!@#$]')
),
member_nick varchar2(30) not null unique
check(regexp_like(member_nick, '^[가-힣][가-힣0-9]{0,9}$')),
member_birth date not null,
member_tel char(11)
check(regexp_like(member_tel, '^010[0-9]{8}$')),
member_email varchar2(100)
check(regexp_like(member_email, '@')),
member_post varchar2(6)
check(regexp_like(member_post, '^[0-9]{5,6}$')),
member_base_address varchar2(150),
member_detail_address varchar2(150),
member_point number default 0 not null
check(member_point >= 0),
member_grade varchar2(9) default '일반' not null
check(member_grade in ('일반', 'VIP', '관리자')),
member_join date default sysdate not null,
membeR_login date
);