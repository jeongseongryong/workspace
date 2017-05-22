/* File I/O - 바이트 스트림 클래스 -inputStream
 * => 바이트 스트림(byte Stream, binary stream)?
 * 		중간에 변경 없이 바이트 단위 그래도 읽고 쓰는 클래스들. 
 */
package step16;

import java.io.FileInputStream;




public class Test02_1_in {

	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("test02_1.data");
		
		int b = in.read();
		System.out.printf("%x ", b);
		
		b = in.read();
		System.out.printf("%x ", b);
		
		b = in.read();
		System.out.printf("%x ", b);
		
		in.close();
		
	}

}