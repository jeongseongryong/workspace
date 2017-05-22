/* character stream 클래스 : FileWriter vs FileInputStream
 */
package step16;

import java.io.FileOutputStream;
import java.io.FileWriter;


public class Test06_1_out {
	
		

	public static void main(String[] args) throws Exception {
		FileOutputStream out = new FileOutputStream("temp/Test06_1_byte.data");
		
		// binary stream 클래스는 무조건 끝 1 바이트 만 출력한다.
		out.write('A'); //0x0041 41
		out.write('B'); //0x0042 42
		out.write('C');	//0x0043 43
		out.write('a');	//0x0061 61
		out.write('b');	//0x0062 62
		out.write('c'); //0x0063 63
		out.write('가');	//0xac00 00
		out.write('각');	//0xac01 01
		out.write('간');	//0xac04 04
		
		out.close();
		System.out.println("실행완료");
		
		
		// character stream 클래스는 유니코드를 OS 기본 문자집합의 코드 값으로 변환하여 출력한다.
		// 만약 파일의 문자집합을 지정한다면, jvm은 그 문자집합의 코드 값으로 변환하여 출력할것이다.
		// java -cp bin -Dfile.encoding=utf8 step16 Test06_1_out
		FileWriter out2 = new FileWriter("temp/Test06_1_char.data");
		
		out2.write('A'); //0x0041 41
		out2.write('B'); //0x0042 42
		out2.write('C'); //0x0043 43
		out2.write('a'); //0x0061 61
		out2.write('b'); //0x0062 62
		out2.write('c'); //0x0063 63
		out2.write('가'); //0xac00 eab080
		out2.write('각'); //0xac01 eab081
		out2.write('간'); //0xac04 eab083
		
		out2.close();
		System.out.println("실행완료");
	}
		
		
}


