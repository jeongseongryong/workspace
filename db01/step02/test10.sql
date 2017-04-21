/* 외부키 컬럼
*/


-- 1)부모 테이블 선언
create table t2 (
  no int,
  titl varchar(10),
  content text
);

alter table t2
  add constraint primary key (no);

alter table t2
 modify column no int auto_increment;


insert into t2(titl, content) values('제목1', '내용.....');
insert into t2(titl, content) values('제목2', '내용.....');
insert into t2(titl, content) values('제목3', '내용.....');


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









--  다른 테이블이 참조하는 데이터 있을 경우, 부모 테이블의 데이터를 지울 수 없다
--  또한 다른 테이블이 참조하는 부모 테이블은 삭제할 수 없다.
--  먼저 자식 테이블을 삭제하라!
drop table t3;
drop table t2;






/* */
