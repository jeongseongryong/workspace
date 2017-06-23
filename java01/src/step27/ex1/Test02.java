package step27.ex1;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test02 {

	public static void main(String[] args) throws Exception {
		
		File file = new File("src/step27/ex1/application-context-01.xml");
			System.out.println(file.getCanonicalPath());
			
		ApplicationContext ctx =
				new FileSystemXmlApplicationContext("file:" + file.getCanonicalPath());

	}

}
