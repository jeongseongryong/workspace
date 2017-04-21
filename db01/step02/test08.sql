/* Unigue 옵션

*/
create table t2 (
  no int,
  name varchar(10),
  email varchar(50)
);

alter table t2
  add constraint primary key (no);

  alter table t2
    add constraint unique(email);


  insert into t2(no, name) values (1, '홍길동');
  insert into t2(no, name) values (2, '임꺽정');
  insert into t2(no, name, email) values (3, '유관순', 'yoo@test.com');
    --기존에 입력된 이메일과 중복된 데이터는 입력 불가! 오류발생! 
  insert into t2(no, name, email) values (4, '안중근', 'yoo@test.com');






drop table t2;






/* */
