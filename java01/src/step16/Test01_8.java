/* File 다루기 - File 클래스 사용법 VII
 * =>FileFilter
 * 
 */
package step16;

import java.io.File;
import java.io.FileFilter;


public class Test01_8 {

	public static void main(String[] args) throws Exception {
		File f = new File("../");
		
		displayDirectory(f, 0);
	}
	
	public static void displayDirectory(File dir, int level) throws Exception {
		File[] files = dir.listFiles(new FileFilter() {
			public boolean accept(File file) {
				if(file.isDirectory() || (file.isFile() && file.getName().endsWith(".class"))) { 
					return true;
			}
			return false;
			}
		}); 
		
		for (File file : files) { 
			if(file.isDirectory()) {
				displayDirectory(file, level +1);
			} else {
						System.out.printf("%s\n", file.getPath()); 		
				}					
		}
	}
	
}

	
