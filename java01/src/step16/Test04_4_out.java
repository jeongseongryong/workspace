/* 데이터 프로세싱 스트림 클래스 - BufferedoutputStream 도입 후
 */
package step16;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class Test04_4_out {
	
	public static void main(String[] args) throws Exception {
		FileOutputStream out0 = new FileOutputStream("temp/Test04_3.data");
		BufferedOutputStream out = new BufferedOutputStream(out0);

			
		long start = System.currentTimeMillis();
		
		
	for(int i = 1; i < 4000000; i++){	
		out.write(i);
		if((i % 10000) ==0) System.out.print(".");
		if((i % 500000) ==0) System.out.println();
	}
		//버퍼가 꽉찼을때 데이터를 출력.
		// 버퍼가 꽉차지 않으면 출력안함.
		// =>이런 경우를 방지 하기위해, 현재버퍼에 있는 데이터를 강제로 출력시키는 방법이필요
		// flush()를 사용해 버퍼에남아있는 데이터를 출력하라 , 필수임 필수래
		out.flush(); 
	
		long end = System.currentTimeMillis();
		
		System.out.printf("\n걸린시간  = %d", end-start);
		
		
		out.close();
		out0.close();
	}

}
