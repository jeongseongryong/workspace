/* File I/O - 바이트 스트림 클래스 -FileOutputStream III
 * => 다양한 타입의 값을 읽기
 */
package step16;

import java.io.FileInputStream;


public class Test02_5_in {

	public static void main(String[] args) throws Exception {
			MyDataInputStream in = new MyDataInputStream("test02_5.data");
			
			
			byte b = in.readByte();
			
			short s = in.readShort();
			
			int i = in.readInt();
			
			String str = in.readUTF();
					
						
			System.out.printf("%x, %x, %x, %s\n ", b, s, i, str);
				
			
			in.close();
	}

}