/* File 다루기 - File 클래스 사용법 4
 * 
 */
package step16;

import java.io.File;
import java.io.FileFilter;


public class Test01_7 {

	public static void main(String[] args) throws Exception {
		File f = new File("../");
		
		displayDirectory(f, 0);
	}
	
	public static void displayDirectory(File dir, int level) throws Exception{
		File[] files = dir.listFiles(new MyFileFilter()); //  <-- 승인후 리스트를 넘긴다.
		
		for (File file : files) { 
			if(file.isDirectory()) {
				displayDirectory(file, level +1);
			} else {
						System.out.printf("%s\n", file.getPath()); 		
				}
					
		}
	}
	
	static class MyFileFilter implements FileFilter {
		public boolean accept(File file) {
			if(file.isDirectory() || (file.isFile() && file.getName().endsWith(".class"))) { 
				return true;
		}
		return false;
		}
	}
}

	
