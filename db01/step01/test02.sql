/* 데이터 조회 명령
select 가져올 컬럼
from 데이터가 저장된 테이블
where 조회 조건
*/

/* 테이블에 모든 데이터와 모든 컬럼 값을 가져오기 */
select * from memb;

/* 테이블의 컬럼 정보 추출 */
describe memb;
desc memb;

/* distinct 키워드*/
/* distinct 키워드 사용 전
=> 수강 신청된 과목의 신청번호와 과목번호를 출력하라.
*/
select lano, lno from lect_appy;

/* distinct 키워드 사용 후
=> 수강 신청된 과목의 번호만 출력하라. 단 중복을 제거하라
*/
select distinct lno from lect_appy;

/* => 강의 데이터 중에서 강의실과 매니저 번호를 추출하라. 중복은 제거하라.
중복? 강의실번호와 매니저번호를 묶어서 같은 데이터는 하나만 출력하라.
*/
select distinct crmno, mrno from lect;

select lno from lect_appy;
select all lno from lect_appy;


select mno, name, tel, email
from memb
order by name asc;

/* select mno, name, tel, email
from memb
order by name; */


select mno, name, tel, email
from memb
order by name desc;
/* */

select lano, lno, sno
from lect_appy
order by lno asc, sno desc;

/* 실행 순서 :form ->select -> order by*
=> order by 에서 컬럼을 지정할떄, select에 선언하지 않은 컬럼을 지정할수 있음,
=>이유?
  select는 추출할 항목이 무엇인지 표시하는 일을 함
  select를 먼저 처리했다고 해서 컬럼이 추출된 상태는 아님.
  단지 결과로 출력할 컬럼 값이 무엇인지 표시한거다.
  그러므로 order by 에서 select에 존재하지 않는 컬럼을 지정할 수 있는것.
*/

select lano, sno
from lect_appy
order by lno asc, sno desc;
