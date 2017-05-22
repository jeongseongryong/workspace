/* 데이터 프로세싱 스트림 클래스 - 직렬화 와 transient 변경자
 * => transient로 선언된 인스턴스 변수의 값은
 * 		파일에 저장되지 않기
 */
package step16;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Test05_3_in {

	public static void main(String[] args) throws Exception {
		FileInputStream in0 = new FileInputStream("temp/Test05_3.data");
		ObjectInputStream in = new  ObjectInputStream(in0);
		
		
		Student3 s = (Student3)in.readObject();
		

		
		in.close();
		in0.close();
		
		System.out.println(s);
		// 직렬화된 데이터를 읽어 들인후에 
		// transient 로 지정된 변수의 값으로 계산됨
		s.compute();
		
		System.out.println(s);
	}

}
