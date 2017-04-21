/* alias

*/

select lno, crmno as classRoomNo, mrno managerNo, titl 'class name'
from lect;

select count(*) cnt from lect;
select concat('(', lno, ':', titl, '-', mrno, ')') lectureInfo from lect;
