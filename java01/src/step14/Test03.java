/* 제네릭(Generic) 문법: 사용 후
 * 
 */
package step14;

import java.util.Date;

public class Test03 {

	public static void main(String[] args) {
		Bucket2<String> b = new Bucket2<>();
		
		b.setValue(new String("Hello"));
		String str2 = b.getValue();

		//b.setValue(new Date());
		
		//b.setValue(new Integer(10));
		
		String str = (String)b.getValue();
		System.out.println(str2.length());
	}

}