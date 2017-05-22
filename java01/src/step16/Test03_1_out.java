/* File I/O - 바이트 스트림 클래스 -FileOutputStream
 * => 바이트 스트림(byte Stream, binary stream)?
 * 		중간에 변경 없이 바이트 단위 그래도 읽고 쓰는 클래스들. 
 */
package step16;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;


public class Test03_1_out {

	public static void main(String[] args) throws Exception {
		/*		
		byte[] buf = new byte[3];
		buf[0] = 0x99
		buf[1] = 0x44
		buf[2] = 0x78
		*/
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		out.write(0x66778899);
		out.write(0x77665544);
		out.write(0x12345678);
		
		byte[] buf = out.toByteArray();
		
		out.close();
		/*
		for(byte b : buf) {
			System.out.printf("%x ", b);
		}
		
		*/
		ByteArrayInputStream in = new ByteArrayInputStream(buf);
		int b =0;
		while (true) {
			b =	in.read();
			if(b == -1)
				break;
			System.out.printf("%x ", b);
		}
	}
	
}

