/* 데이터 프로세싱 스트림 클래스 - ObjectOutputStream 도입 후
	=>	객체 출력
	=> 직렬화(Serialize = marshaling)"
			인스턴스 ----> 바이트배열
	=> 객체 복원 (Deserialize = unmarshaling) 
			바이트 배열 ---->인스턴스
 */
package step16;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Test05_2_out {
	
		

	public static void main(String[] args) throws Exception {
		// java.io.Serializable 의 규약(=규격=규칙)을 따르고있다.
		//Student s = new Student ("홍길동", 100, 90, 80, false);
		Student2 s = new Student2 ("홍길동", 100, 90, 80, false);
		
		FileOutputStream out0 = new FileOutputStream("temp/Test05_2.data");
		ObjectOutputStream out = new ObjectOutputStream(out0);
		
		out.writeObject(s);
		
		out.close();
		out0.close();
	}
		
		
}


