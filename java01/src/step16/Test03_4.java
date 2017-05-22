/* File I/O - DataOutputStream
 */
package step16;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;


public class Test03_4 {

	public static void main(String[] args) throws Exception {	
		ByteArrayOutputStream out0 = new ByteArrayOutputStream();
		DataOutputStream out = new DataOutputStream(out0);
		 byte b = 0x11;
	    out.writeByte(b);
	    
	    short s = 0x2233;
	    out.writeShort(s);
	    
	    int i = 0x44556677;
	    out.writeInt(i);
	    
	    String str = "ABC가각간";
	    out.writeUTF(str);
	    	  	    	     	    
		
		byte[] buf = out0.toByteArray();
		
		out.close();
		
		// input
		ByteArrayInputStream in0 = new ByteArrayInputStream(buf);
		DataInputStream in = new DataInputStream(in0);
		byte b2 = in.readByte();
    
    short s2 =in.readShort();
    
    int i2 = in.readInt();
        
    String str2 = in.readUTF();
    
    in.close();
    
    	System.out.printf("%x, %x, %x, %s\n", b2, s2, i2, str2);
    

	}
}
