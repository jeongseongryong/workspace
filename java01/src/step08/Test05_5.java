/*유틸리티 클래스 : java.spl.Date 클래스
 */
package step08;

import java.sql.Date;

public class Test05_5  {
	
	public static void main(String[] args){
		long currTime = System.currentTimeMillis();
	 Date today = new Date(currTime);
	 System.out.println(today);
	}
	
}
	
	


