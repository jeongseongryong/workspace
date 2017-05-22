package step16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class DataOutputStream {
		OutputStream out;
		
	public DataOutputStream(OutputStream out) throws FileNotFoundException {
		this.out = out;
	}
	
	public void writeByte(byte b) throws IOException {
		out.write(b);
	}
	
	public void writeShort(short s) throws IOException {
		out.write(s >> 8);
		out.write(s);
	}
	
	public void writeInt(int i) throws IOException {
		out.write(i >> 24);
		out.write(i >> 16);
		out.write(i >> 8);
		out.write(i);
	}
	
	public void writeUTF(String str) throws IOException {
		byte[] bytes = str.getBytes("UTF-8");
		int len = bytes.length;	
		out.write(len >> 8);
		out.write(len);
		out.write(bytes);
		
	}
	public void close() throws IOException {
		out.close();
	}
	
}