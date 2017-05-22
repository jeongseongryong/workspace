package asd;

import java.io.File;
import java.io.IOException;


public class BIT_ls {

	
	public static void main(String[] args) throws Exception {
		File f = new File("../");
		displayDirectory(f, 0);
	}
	public static void displayDirectory(File dir, int level) {
		File[] files = dir.listFiles();
		
		for (File file : files) {
			for (int i = 0; i < level; i++) System.out.print("  ");
			
			System.out.printf("%s 크기:%d 파일명:%s\n", 
					(file.isDirectory() ? "디렉토리," : " "),
					file.length(),
					file.getName()
					);
					
			if(file.isDirectory()) {
				displayDirectory(file, level + 1);
			}
		}
	}
}



/*
public static void main(String[] args) throws IOException {

String filePath = "C:\\";
File f1 = new File(filePath);
String[] list = f1.list();
for(int i =0; i<list.length; i++){
   File f2 = new File(filePath, list[i]);
   if(f2.isDirectory()){
       System.out.printf("디렉토리 : %s %n",list[i]);
   }else{
       System.out.printf("파일 : %s %, dbyte %n",list[i],f2.length());
   }
}
}
*/