/* 조인
1) cross 조인
2) Natural 조인
3) join ~ on
4) outer join
*/


-- 실행순서: from -> where -> select -> order by
select mno, name, email from memb;
select sno, work, lst_schl, schl_nm from stud;
-- 1)cross 조인

select mno, name, sno, work, lst_schl
from memb, stud;
 /* 두 테이블의 컬럼이 이름이 겹치면 오류발생 ,
 =>그럴경우 테이블에 별명 부여
 =>그리고 컬럼을 지정 할 떄 테이블의 별명을 붙여라
*/
 select m.mno, m.name, s.sno, s.work, s.lst_schl
 from memb as m, stud as s;

/* 표준 문법*/
select m.mno, m.name, s.sno, s.work, s.lst_schl
from memb m cross join stud  s;


select lno crmno, titl, name
from lect l cross join croom;



select lno, l.crmno, titl, name
from lect l cross join croom c;

select l.lno, l.crmno, l.titl, c.name
from lect l cross join croom c;


select l.lno, l.crmno, l.titl, c.crmno, c.name
from lect l , croom c
where l.crmno = c.crmno;

-- 만약 강의 제목의 컬럼이 이름이 'titl' 아니라 'name' 이라 가정하자!

select l.lno, l.crmno, l.titl, c.crmno, c.name
from lect l natural join croom c;

select l.lno, l.crmno, l.titl, c.crmno, c.name
from lect l join croom c using (crmno);



select m.mno, m.name, s.sno, s.work, s.lst_schl
from memb m natural join stud  s;

select m.mno, m.name, s.sno, s.work, s.lst_schl
from memb m cross join stud s
where m.mno = s.sno;


select m.mno, m.name, s.sno, s.work, s.lst_schl
from memb m  join stud s on m.mno = s.sno;

select m.mno, m.name, s.sno, s.work, s.lst_schl
from memb m inner join stud s on m.mno = s.sno;

-- outer 조인
-- inner join의 문제점을 해결하기 위해 나온 문법
-- inner join의 문제점?
-- 두 테이블 데이터 간에 일치하는 데이터가 있을 떄 결과로 추출될 수 있다.
--  없다면 결과에 포함되지 않는다.


select l.lno, l.titl, c.name
from lect l inner join croom c on l.crmno = c.crmno;
-- 위의 질의문은 강의실이 배정안된 강의가 결과에서 누락되는 문제가 있다.


-- 조인할 때 일치하는 데이터가 없더라도 결과에 포함시키는 방법?
-- outer join 이다.
-- 결과에 반드시 포함시켜야 할 테이블을 지정하라
-- outer 결과에 포함시켜야할 테이블이 왼쪽테이블이냐 오른쪽 테이블이냐 join~
-- outer left / right join
select l.lno, l.titl, c.name
from lect l left outer join croom c on l.crmno = c.crmno;

select l.lno, l.titl, c.name
from lect l right outer join croom c on l.crmno = c.crmno;


/*예) 수강 신청 정보를 다음과 같이 출력하라
lect(강의정보), croom(강의실), mar(매니저),
 lect_appy(수강신청), stud(학생), memb(회원기본정보)
출력결과:
수강신청번호, 강의명, 교실이름, 매니저이름, 매니저직급, 수강생명, 재직여부
*/
-- 수강신청번호,강의제목
select la.lano, l.titl
from lect_appy la inner join lect l on la.lno = l.lno;

select la.lano, l.titl, cr.name
from lect_appy la
  inner join lect l on la.lno = l.lno
  left outer join croom cr on l.crmno = cr.crmno;

select la.lano, l.titl, cr.name, m.name, mr.posi, m2.name, s.work
from lect_appy la
  inner join lect l on la.lno = l.lno
  left outer join croom cr on l.crmno = cr.crmno
  left outer join memb m on l.mrno = m.mno
  left outer join mgr mr on l.mrno = mr.mrno
  left outer join memb m2 on la.sno = m2.mno
  left outer join stud s on la.sno = s.sno;


/*      */
