create table music(
music_no number primary key,
music_title varchar2(90) not null,
music_artist varchar2(90) not null,
music_album varchar2(90) not null,
music_play number default 0 not null check(music_play >= 0),
release_time date not null
);

create sequence music_seq;