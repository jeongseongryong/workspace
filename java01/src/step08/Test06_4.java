/*컬렉션 클래스 : 사용전 -목록을 다루는 클래스 구현
 */
package step08;

import java.sql.Date;

public class Test06_4  {
	
	public static void main(String[] args) {
	Test06_2_ArrayList dateList = new Test06_2_ArrayList();

		dateList.add(Date.valueOf("2017-3-1"));
		dateList.add(Date.valueOf("2017-5-3"));
		dateList.add(Date.valueOf("2017-5-5"));
		dateList.add(Date.valueOf("2017-5-9"));
		dateList.add(Date.valueOf("2017-6-6"));
		

			for(int i = 0; i < dateList.size(); i++){
				Date date = (Date) dateList.get(i);
				System.out.printf("%d월 %d일\n",date.getMonth()+1,date.getDate());
		}
	}	
}	


