/* 데이터 프로세싱 스트림 클래스 - 직렬화와 transient(일시적인) 변경자
 */
package step16;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Test05_3_out {
	
		

	public static void main(String[] args) throws Exception {
		//Student2 s = new Student2 ("홍길동", 100, 90, 80, false);
		Student3 s = new Student3 ("홍길동", 100, 90, 80, false);
		FileOutputStream out0 = new FileOutputStream("temp/Test05_3.data");
		ObjectOutputStream out = new ObjectOutputStream(out0);
		
		out.writeObject(s);
		
		out.close();
		out0.close();
	}
		
		
}

