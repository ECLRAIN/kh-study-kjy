drop table book;
create table book(
book_serial number primary key,
book_name varchar2(90) not null,
book_writer varchar2(90) not null,
book_publisher varchar2(90) not null,
book_price number not null check(book_price >= 0),
book_genre varchar2(30) not null,
creation_time date default sysdate not null
);
create sequence book_seq;