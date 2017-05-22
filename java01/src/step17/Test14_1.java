/*예외처리 : 자원 자동 해제 try ~ catch ~블록(try-with-resources 문장)
 * 
 */
package step17;

import java.io.FileInputStream;

public class Test14_1 {	
	
	public static void main(String[] args) {
		FileInputStream in = null;
		
		// 자원을 자동 해제시키는 try ~ catch ~ 사용전!
		try {
			in = new FileInputStream("step17.Test14.data");
			
			int b = 0;
			while((b=in.read()) != -1) {
				System.out.printf("%x ", b);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
		} finally {
			// 파일의 자원을 해제시키다가, close()호출 하다가, 발생된 예외는 무시
			try {in.close();} catch (Exception e) {/*무시*/}
			
			
		}
	}
		
}


