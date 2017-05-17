/*컬렉션 클래스 II : java.lang.ArrayList
 */
package step08;

import java.sql.Date;
import java.util.ArrayList;

public class Test07_11  {
	
	public static void main(String[] args) {
	ArrayList<Date> dateList = new ArrayList<>();

		dateList.add(Date.valueOf("2017-3-1"));
		dateList.add(Date.valueOf("2017-5-3"));
		dateList.add(Date.valueOf("2017-5-5"));
		dateList.add(Date.valueOf("2017-5-9"));
		Date d1 = Date.valueOf("2017-6-6");
		dateList.add(d1);
		dateList.add(d1);
		
		dateList.add(4, Date.valueOf("2017-2-22")); // 정해진 배열의 추가		
		Date removedObj = dateList.remove(3); // 삭제
		
		Date oldObj = dateList.set(1, Date.valueOf("2017-5-4")); // 변경

			for(Date date : dateList){
				System.out.printf("%d월 %d일\n",date.getMonth() +1, date.getDate());
		}
			System.out.println("=>" + removedObj);
			System.out.println("=>" + oldObj);
	}	
}	


