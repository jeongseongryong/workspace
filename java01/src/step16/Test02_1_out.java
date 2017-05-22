/* File I/O - 바이트 스트림 클래스 -FileOutputStream
 * => 바이트 스트림(byte Stream, binary stream)?
 * 		중간에 변경 없이 바이트 단위 그래도 읽고 쓰는 클래스들. 
 */
package step16;

import java.io.FileOutputStream;



public class Test02_1_out {

	public static void main(String[] args) throws Exception {
		FileOutputStream out = new FileOutputStream("test02_1.data");
		
		out.write(0x66778899);
		out.write(0x77665544);
		out.write(0x12345678);
		
		out.close();
		
	}

}