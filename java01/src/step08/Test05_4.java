/*유틸리티 클래스 : java.util.Date class 와 import 명령문
 */
package step08;

import java.util.Date;

public class Test05_4  {
	
	public static void main(String[] args){
	 Date today = new Date();
	 
	 System.out.println(today.getYear() + 1900); //기분이 1900년이다.
	 System.out.println(today.getMonth() + 1); // 값의 범위가  0 ~ 11 이다
	 System.out.println(today.getDate()); // 그 달을 기준으로 한다.
	 System.out.println(today.getDay()); // 그 주를 기준으로 한다. 일(0), 월(1), ...
	 System.out.println(today.getHours()); // 그 일을 기준으로 한다. 0 ~ 23
	 System.out.println(today.getMinutes());
	 System.out.println(today.getSeconds());
	 System.out.println(today.getTime()); //  1970년 1월 1일  0시 0분 0초를 기준으로 경과된 밀리초
	 
	}
	
}
	
	


