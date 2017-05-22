/* 데이터 프로세싱 스트림 클래스 - BufferedoutputStream 도입 후
 */
package step16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class Test04_3_out {
	
	static class MyBufferedOutputStream {
		OutputStream out;
		byte[] buf = new byte[8192];
		int cursor;
		
		MyBufferedOutputStream(OutputStream out) {
			this.out = out;
		}
		
		public void write(int b)  throws IOException{
			buf[cursor++] = (byte)b;
			
			if(cursor == buf.length) { // 버퍼가 꽉 찼다면 출력한다.
				out.write(buf);
				cursor = 0;
			}
		}
		public void flush() throws IOException { // flush() 현재 버퍼에 들어있는 값만 출력하라
			out.write(buf, 0, cursor);
		}
		public void close() {} 
	}

	public static void main(String[] args) throws Exception {
		FileOutputStream out0 = new FileOutputStream("temp/Test04_3.data");
		MyBufferedOutputStream out = new MyBufferedOutputStream(out0);

			
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
