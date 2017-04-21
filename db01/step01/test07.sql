/* 데이터 입력, 변경, 삭제     */
-- 입력
insert memb(mno, name, tel, email, pwd)
  values(40, '헝길덩1', '1111-1111','hong@test.com', '1111');



insert memb(name, tel, email, pwd)
  values('헝길덩2', '1111-1111','hong2@test.com', '1111');



insert memb(name, tel, email, pwd)
  values('헝길덩3', '1111-1111','hong3@test.com', password('1111'));



insert memb
  values(45, '헝길덩4', '1111-1111','hong4@test.com', password('1111'));


insert tcher(tno, hmpg)
select mno, 'http://www.bitcamp.co.kr'
from memb
where mno between 40 and 49;

-- 변경
update tcher set fcbk='okok', twit='nono'where tno=40;

update memb set pwd=password('1111');
-- update memb set pwd=('1111');

-- 3) 데이터 삭제하기

delete from tcher where tno in(40, 45);

delete from memb where mno in(40, 45);


delete from memb where mno = 41; // 오류 발생!

delete from tcher where tno = 41;
delete from memb where mno =41;














/*  */
