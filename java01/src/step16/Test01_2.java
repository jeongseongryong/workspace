/* File 다루기 - File 클래스 사용법 II
 * 
 */
package step16;

import java.io.File;
import java.util.Calendar;

public class Test01_2 {

	public static void main(String[] args) throws Exception {
		File f = new File("hellow.txt");
		
			f.createNewFile();
		
			f.delete();
	}

}