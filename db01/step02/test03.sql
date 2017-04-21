/* Primary Key 컬럼을 지정하기

*/

-- 방법1) 컬럼 선언 시, pk 여부 지정
create table t2 (
  no int primary key,
  name varchar(10),
  gender char(1),
  height numeric(4, 1),
  intro text,
  birthday date,
  regdate datetime
);



--  방법2) 컬럼들을 선언한 후 PK 여부를 지정하기
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
-- 방법3) 테이블을 정의

create table t2 (
  no int,
  name varchar(10),
  gender char(1),
  height numeric(4, 1),
  intro text,
  birthday date,
  regdate datetime
);
-- 테이블을 생성한 후 제약 조건 추가
alter table t2
  add constraint primary key (no);

  --  PK 컬럼은 중복값을 가질 수 없다.
  insert into t2(no, name, gender, height, intro, birthday, regdate)
    values(1, '홍길순', 'W', 160.5, '길순이..', '1993-5-5', '2017-4-17 15:23:11' );

    --  PK 컬럼은 기본이 not null 이다.
    insert into t2(name, gender, height, intro, birthday, regdate)
      values('홍길순', 'W', 160.5, '길순이..', '1993-5-5', '2017-4-17 15:23:11' );



drop table t2;









/* */
