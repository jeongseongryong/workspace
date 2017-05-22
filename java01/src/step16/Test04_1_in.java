/* 데이터 프로세싱 스트림 클래스 - BufferedInputStream 도입 전
 */
package step16;

import java.io.FileInputStream;


public class Test04_1_in {

	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("temp/jls8.pdf");

		int b = 0;
		int count = 0;
		int countPoint = 0;
		
		long start = System.currentTimeMillis();
		
		
		while ((b = in.read()) != -1);{
			if(++count == 10000) {
				count = 0;
				System.out.print(".");
				if((++countPoint % 50) == 0) System.out.println();
			}		
		}
		
		long end = System.currentTimeMillis();
		
		System.out.printf("\n걸린시간  = %d", end-start);
		
		
		in.close();
	}

}