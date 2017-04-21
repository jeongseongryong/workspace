/* 서브쿼리     */
select
  la.lano,
  l.titl,
  cr.name,
  m.name,
  mr.posi,
  m2.name,
  s.work
from lect_appy la
  inner join lect l on la.lno = l.lno
  left outer join croom cr on l.crmno = cr.crmno
  left outer join memb m on l.mrno = m.mno
  left outer join mgr mr on l.mrno = mr.mrno
  left outer join memb m2 on la.sno = m2.mno
  left outer join stud s on la.sno = s.sno;



-- 1)select 절에 서브쿼리 사용하기

select
  la.lano,
  l.titl,
  (select name from croom where crmno=l.crmno) room,
  (select name from memb where mno=l.mrno) mname,
  (select posi from mgr where mrno=l.mrno) position,
  (select name from memb where mno=la.sno) sname,
  (select work from stud where sno=la.sno) working
from lect_appy la
  inner join lect l on la.lno = l.lno
  -- left outer join croom cr on l.crmno = cr.crmno;


-- 2)from 절 에서 서브쿼리 사용하기

-- 매니저 번호와 이름 데이터 뽑기
select mr.mrno, m.name
from mgr mr inner join memb m on mr.mrno = m.mno ;
-- 강의 번호와 강의명, 매니저번호 뽑기
select lno, titl, mrno
from lect l;

--  강의 번호와 강의명, 매니저이름 데이터 뽑기
--  일반 조인으로 해결하기
select l.lno, l.titl, m.name
from lect l
  left outer join memb m on l.mrno = m.mno;

-- 서브 쿼리를 사용하여 조인하기

select l.lno, l.titl, t1.name
from lect l
  inner join (
    select mr.mrno, m.name
    from mgr mr inner join memb m on mr.mrno = m.mno
    where m.name = '매니저1') t1
    on l.mrno = t1.mrno;


--  3) where 절에 서브쿼리 사용하기
-- 강남 강의실이 배정된  강의정보를 출력하라
  -- 출력번호: 강의번호, 강의명
  from lect;

  -- 강남 강의실 정보를 추출한다.
  select crmno, name
  from croom
  where name like '강남%';

--  where 절에 서브쿼리를 넣어 강남 강의실이 배정된 정보 추출
  select lno, titl, crmno
  from lect l
  where l.crmno in (select crmno from croom where name like '강남%');
/*      */
