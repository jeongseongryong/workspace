/* 데이터 프로세싱 스트림 클래스 - BufferedoutputStream 도입 전
 */
package step16;

import java.io.FileOutputStream;


public class Test04_1_out {

	public static void main(String[] args) throws Exception {
		FileOutputStream out = new FileOutputStream("temp/Test04_1.data");

			
		long start = System.currentTimeMillis();
		
		
	for(int i = 1; i < 4000000; i++){	
		out.write(i);
		if((i % 10000) ==0) System.out.print(".");
		if((i % 500000) ==0) System.out.println();
	}
		long end = System.currentTimeMillis();
		
		System.out.printf("\n걸린시간  = %d", end-start);
		
		
		out.close();
	}

}
