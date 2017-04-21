/* 컬럼의 데이터 타입 지정

int : 정수값
number : 정수 및 부동소수점
char(x):x 개의 문자를 입력 할 수 있는 컬럼
varchar(x): variable character라는 의미. 최대 x 개의 문자를 입력 할 수 있는 컬럼
*/

-- 생성
create table t2 (
  no int,
  name varchar(10),
  gender char(1),
  height numeric(4, 1),
  intro text,
  birthday date,
  regdate datetime
);
--  삭제
> show tables;

>describe 테이블명;
>desc 테이블명;

insert into t2(no, name, gender, height, intro, birthday, regdate)
values(1, '홍길순', 'W', 160.5, '길순이..', '1993-5-5', '2017-4-17 15:23:11' );


/* no:into => 3.14 입력하면 소수점 이하가 잘려서 들어감*/
insert into t2(no, name, gender, height, intro, birthday, regdate)
values(3.14, '홍길순', 'W', 160.5, '길순이..', '1993-5-5', '2017-4-17 15:23:11' );

-- varchar(10) => 12345678901 입력, 크기가 초과되어 오류
insert into t2(no, name, gender, height, intro, birthday, regdate)
values(4, '12345678901', 'W', 160.5, '길순이..', '1993-5-5', '2017-4-17 15:23:11' );

-- varchar(10) => 한글 10자 입력. ok! 영어 숫자 한글 숫자 따지지 않고 최대 10자만가능!
-- DBMS에 따라 동작이 다를 수 있다.
insert into t2(no, name, gender, height, intro, birthday, regdate)
values(5, '가나다라마바사아자차', 'W', 160.5, '길순이..', '1993-5-5', '2017-4-17 15:23:11' );

insert into t2(no, name, gender, height, intro, birthday, regdate)
values(5, '가나다라마바사아자차카', 'W', 160.5, '길순이..', '1993-5-5', '2017-4-17 15:23:11' );
--  numeric(4,1) => 최대 4자리 숫자. 소수점 이하 한자리만 가능
--  소수점이 2자리면 반올림 처리됨.
insert into t2(no, name, gender, height, intro, birthday, regdate)
values(6, '홍길동', 'W', 60.57, '길순이..', '1993-5-5', '2017-4-17 15:23:11' );

--  소수점 이상의 자릿수가 초과하면 오류!
insert into t2(no, name, gender, height, intro, birthday, regdate)
values(6, '홍길동', 'W', 2060, '길순이..', '1993-5-5', '2017-4-17 15:23:11' );
-- date => 날짜 정보만 저장됨, 시간정보를 입력해도 날짜정보만 저장됨
insert into t2(no, name, gender, height, intro, birthday, regdate)
values(6, '홍길동', 'W', 150, '길순이..', '1993-5-5 7:3:5', '2017-4-17 15:23:11' );
-- datetime => 날짜와 시간 정보 저장 , 시간정보를 주지않으면 0시 0분 0초로 설정됨
insert into t2(no, name, gender, height, intro, birthday, regdate)
values(6, '홍길동', 'W', 150, '길순이..', '1993-5-5', '2017-4-17' );


drop table t2;
