/*예) 수강 신청 정보를 다음과 같이 출력하라
lect(강의정보), croom(강의실), mar(매니저),
 lect_appy(수강신청), stud(학생), memb(회원기본정보)
출력결과:
수강신청번호, 강의명, 교실이름, 매니저이름, 매니저직급, 수강생명, 재직여부
*/

create table t2 (
  no int,
  name varchar(10),
  gender char(1),
  height numeric(4, 1),
  intro text,
  birthday date,
  regdate datetime
);


insert into t2 (no, name, gender, height, intro, birthday, regdate)
  values(1, '여자', 'W', 160.5, '길순이..', '1995-5-10', '2017-4-17 17:19:7');

insert into t2 (no, name, gender, height, intro, birthday, regdate)
  values(3.14, '여자', 'W', 160.5, '길순이..', '1995-5-10', '2017-4-17 17:19:7');

insert into t2 (no, name, gender, height, intro, birthday, regdate)
  values(4, '123456789071', 'W', 160.5, '길순이..', '1995-5-10', '2017-4-17 17:19:7');

insert into t2 (no, name, gender, height, intro, birthday, regdate)
  values(5, '가나다라마바사아자차', 'W', 160.5, '길순이..', '1995-5-10', '2017-4-17 17:19:7');

insert into t2 (no, name, gender, height, intro, birthday, regdate)
  values(5, '가나다라마바사아자차카', 'W', 160.5, '길순이..', '1995-5-10', '2017-4-17 17:19:7');

insert into t2 (no, name, gender, height, intro, birthday, regdate)
  values(6, '홍길동', 'W', 60.57, '길순이..', '1995-5-10', '2017-4-17 17:19:7');

insert into t2 (no, name, gender, height, intro, birthday, regdate)
  values(6, '홍길동', 'W', 2060, '길순이..', '1995-5-10', '2017-4-17 17:19:7');

insert into t2 (no, name, gender, height, intro, birthday, regdate)
  values(6, '홍길동', 'W', 150, '길순이..', '1995-5-10', '2017-4-17 17:19:7');


  insert into t2(no, name, gender, height, intro, birthday, regdate)
  values(6, '홍길동', 'W', 150, '길순이..', '1993-5-5', '2017-4-17' );

create table t2 (
  no int primary key,
  name varchar(10),
  gender char(1),
  height numeric(4, 1),
  intro text,
  birthday date,
  regdate datetime
);

create table t2 (
  no int,
  name varchar(10),
  gender char(1),
  height numeric(4, 1),
  intro text,
  birthday date,
  regdate datetime,
  constraint primary key (no)
);

create table t2 (
  no int,
  name varchar(10),
  gender char(1),
  height numeric(4, 1),
  intro text,
  birthday date,
  regdate datetime
);

alter table t2
add constraint primary key (no);



 insert into t2(no, name, gender, height, intro, birthday, regdate)
   values(1, '홍길순', 'W', 160.5, '길순이...', '1995-5-5', '2017-4-17 19:10:5');

   insert into t2(name, gender, height, intro, birthday, regdate)
     values( '홍길순', 'W', 160.5, '길순이...', '1995-5-5', '2017-4-17 19:10:5');




create table t2 (
  no int,
  name varchar(10),
  gender char(1),
  height numeric(4, 1),
  intro text,
  birthday date,
  regdate datetime
);

alter table t2
  add constraint primary key (no);


alter table t2
  add column tel varchar(10);

alter table t2
  add column fax varchar(10),
  add column email varchar(50),
  add column mobile varchar(10);

  alter table t2
   drop column email;

  alter table t2
    drop fax;


create table t2 (
  no int,
  name varchar(10),
  gender char(1),
  height numeric(4, 1),
  intro text,
  birthday date,
  regdate datetime
);

alter table t2
  add constraint primary key (no);

insert into t2(no, name, gender, height, intro, birthday, regdate)
values(1, '홍길순', 'W', 160.5, '길순이..', '1993-5-5', '2017-4-17 19:35:7');

insert into t2(no, name, gender, height, intro, birthday, regdate)
values(2, '홍길순이다.', 'W', 160.5, '길순이..', '1993-5-5', '2017-4-17 19:35:7');

insert into t2(no, name, gender, height, intro, birthday, regdate)
values(3, '홍길순이라고한다.', 'W', 160.5, '길순이..', '1993-5-5', '2017-4-17 19:35:7');




alter table t2
  chge column name fst_nm varchar(10),
  add colunm lst_nm varchar(10);

alter table t2
  modify column fst_nm varchar(9);

alter table t2
  modify colum fst_nm varchar(8);

alter table t2
 modify colum height varchar(10);

 alter table t2
 modify column gender int;



create table t2 (
  no int,
  name varchar(10),
  gender char(1),
  height numeric(4, 1),
  intro text,
  birthday date,
  regdate datetime
);

alter table t2
 add constraint primary key (no);

 insert into t2(no, gender)
values(1, 'W');

insert into t2(no)
  values(2);



  create table t2 (
    no int,
    name varchar(10) default '홍',
    gender char(1) not null default 'W',
    height numeric(4, 1),
    intro text,
    birthday date,
    regdate datetime
  );

  alter table t2
   add constraint primary key (no);


insert into t2(no, gender)
  values(1, 'M');

  insert into t2 (no)
values(2);


create table t2(
no int,
title varchar(10),
constent text
);

alter table t2
  add constraint primary key(no);


alter table t2
  modify column no int auto_increment;

insert into t2(title, constent) values('제목1', '내용...');
  insert into t2(title, constent) values('제목2', '내용...');
    insert into t2(title, constent) values('제목3', '내용...');

      create table t3 (
        no int,
        bno int not null,
        file varchar(100) not null
      );

      alter table t3
        add constraint primary key (no);
      alter table t3
        modify column no int auto_increment;


insert into t3(bno, file) values(10, 'aaa.gif');

  delete from t3;

    alter table t3
      add foreign key (bno) references t2(no);


insert into t3(bno, file) values(10, 'aaa.gif');

insert into t3(bno, file) values(2, 'aaa.gif');






  /* */
  drop table t3;
  drop table t2;
