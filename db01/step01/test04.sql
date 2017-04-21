/* where


*/


-- 실행순서: from -> where -> select -> order by
select lno, titl, mrno
from lect
where mrno is null
order by titl asc;

-- 비교 연산자: =, <, >, <=, >=, !=, <>

select lno, titl, mrno
from lect
where mrno = 32;

select lno, titl, mrno
from lect
where mrno != 32;

select lno, titl, mrno
from lect
where mrno <> 32;

select lno, titl, pric
from lect
where pric > 300000;

select lno, titl, pric
from lect
where pric < 300000;

select titl, sdt, edt
from lect;
where sdt >= '2017-5-1';

select lno, titl, mrno
from lect
where mrno is null;
--  where mrno = null;
-- 산술 연산자: +, -,  *,  /  우선순위: () *,/  +,-

select lno, titl, pric, (pric - (pric * 0.2)) pric2
from lect;



/* 날짜더하기 */
select titl, sdt, date_add(sdt, interval 27 day) from lect;

-- 논리연산자: and, or, not

select lno, titl, pric
from lect
where pric > 300000 and pric < 500000;

select lno, titl, pric
from lect
where pric < 300000 or pric > 1000000;

select lno, titl, mrno
from lect
where not mrno = 32;

--  in 연산자: in (값, 값, 값, ...)
--  =>괄호 안에 저장한 값과 일치하는 경우 true 리턴
select lno, titl, mrno
from lect
where mrno in (31, 32);

--  like 연산자: 문자열 비교 연산자
--  => 컬럼명 like 'aaa' --->  컬럼명 = 'aaa'
--  => 컬럼명 like 'a%' ---> 문자 'a' 로 시작하는 것
--  => 컬럼명 like '%a' ---> 문자 'a' 로 끝나는 것
--  => 컬럼명 like '%aaa%' ---> 문자열 'aaa'를 포함하는 것
--  => 컬럼명 like 'aa_bb' ---> aa 다음에 한 문자는 어떤것이라도 된다. 그리고 뒤에 bb가 온다.
select lno, titl
from lect
where titl = '자바기초';

select lno, titl
from lect
where titl like '자바기초';


select lno, titl
from lect
where titl  like '웹%';

select *
from croom
where name like '강남_01';

/* beteewn A and B  연산자 */
select lno, titl, pric
from lect
where pric between 150000 and 450000;


select lno, titl, sdt, edt
from lect
where sdt between '2017-5-1' and '2017-6-30';

/* is null : 값이 설정되지않은것 */
select lno, titl, crmno
from lect
where crmno is null;

/* union : 두개의 결과를 더하는연산자 */
select mrno, posi from mgr
union
select tno, hmpg from tcher


/* union : 중복
*/

select mrno from mgr
union all
select tno from tcher;
