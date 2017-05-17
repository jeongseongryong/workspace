/* File 다루기 - File 클래스 사용법
 * 
 */
package step16;

import java.io.File;

public class Test01_1 {

	public static void main(String[] args) {
		File f = new File("../.."); //현재 폴더 정보를 가져온다.
		
		System.out.printf("getAbsolutePath()= %s\n",f.getAbsolutePath());
		
		System.out.printf("getAbsolutePath()= %s\n",f.getCanonicalFile());
	}

}
