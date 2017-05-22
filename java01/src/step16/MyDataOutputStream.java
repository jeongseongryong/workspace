package step16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class MyDataOutputStream extends FileOutputStream{
	
	public MyDataOutputStream(String name) throws FileNotFoundException {
		super(name);
	}
	
	public void writeByte(byte b) throws IOException {
		this.write(b);
	}
	
	public void writeShort(short s) throws IOException {
		this.write(s >> 8);
		this.write(s);
	}
	
	public void writeInt(int i) throws IOException {
		this.write(i >> 24);
		this.write(i >> 16);
		this.write(i >> 8);
		this.write(i);
	}
	
	public void writeUTF(String str) throws IOException {
		byte[] bytes = str.getBytes("UTF-8");
		int len = bytes.length;	
		this.write(len >> 8);
		this.write(len);
		this.write(bytes);
	}
	
}
