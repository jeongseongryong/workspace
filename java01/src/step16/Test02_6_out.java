/* File I/O - 바이트 스트림 클래스 -FileOutputStream IIII
 * => 다양한 타입의 값을 출력하기
 */
package step16;

import java.io.DataInputStream;
import java.io.FileOutputStream;


public class Test02_6_out {

	public static void main(String[] args) throws Exception {
		FileOutputStream out0 = new FileOutputStream("test02_6.data");		
		DataOutputStream out = new DataOutputStream(out0);
		
		byte b = 0x11;
		out.writeByte(b);
		
		short s = 0x2233;
		out.writeShort(s);
		
		
		int i = 0x44556677;
		out.writeInt(i);
		
		String str = "ABC가각간";
		out.writeUTF(str);

		
		out.close();
		
		System.out.println("파일 출력 완료");
	}

}
