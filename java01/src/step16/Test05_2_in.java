/* 데이터 프로세싱 스트림 클래스 - ObjectInputStream 도입 후
 */
package step16;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Test05_2_in {

	public static void main(String[] args) throws Exception {
		FileInputStream in0 = new FileInputStream("temp/Test05_2.data");
		ObjectInputStream in = new  ObjectInputStream(in0);
		
		
		Student2 s = (Student2)in.readObject();
		

		
		in.close();
		in0.close();
		
		System.out.println(s);
	}

}
