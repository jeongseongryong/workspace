/* File I/O - 바이트 스트림 클래스 -FileOutputStream
 * => 바이트 스트림(byte Stream, binary stream)?
 * 		중간에 변경 없이 바이트 단위 그래도 읽고 쓰는 클래스들. 
 */
package step16;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;


public class Test03_3 {

	public static void main(String[] args) throws Exception {	
		MyArrayOutputStream out = new MyArrayOutputStream();
		
		 byte b = 0x11;
	    out.writeByte(b);
	    
	    short s = 0x2233;
	    out.writeShort(s);
	    
	    int i = 0x44556677;
	    out.writeInt(i);
	    
	    String str = "ABC가각간";
	    out.writeUTF(str);
	    	  	    	     	    
		
		byte[] buf = out.toByteArray();
		
		out.close();
		
		// input
		MyArrayInputStream in = new MyArrayInputStream(buf);
		
		byte b2 = in.readByte();
    
    short s2 =in.readShort();
    
    int i2 = in.readInt();
        
    String str2 = in.readUTF();
    
    in.close();
    
    	System.out.printf("%x, %x, %x, %s\n", b2, s2, i2, str2);
    

	}
}

