/* 웹 애플리케이션 실행하기
 * 1) 클라이언트가 요구하는 자원의 경로를 알아내기
 * 2) 클라이언트가 요청한 자원을 처리한다.
 * 3) HttpProcesor 클래스를 패키지 멤버 클래스로 분리
 * 4) Command 패턴 적용
 * 5) 서블릿 객체 생성 자동화
 * 6) 애노테이션을 적용하여 서블릿 객체 생성 자동화
 */
package step23.ex12;

import java.io.File;
import java.io.FileReader;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

import javax.swing.filechooser.FileFilter;

import org.omg.CORBA.PUBLIC_MEMBER;


public class HttpServer {
  int port;
  HashMap<String, Command> servletMap = new HashMap<>();
  
  String currBinDirPath;
  
  ArrayList<Class> classes = new ArrayList<>();
  
  
  public HttpServer(int port) throws Exception {
    this.port = port;
    
   currBinDirPath  = new File("./bin/").getCanonicalPath().replaceAll("\\\\", "/") + "/";
   
   findClassFile(new File("./bin/"), "step23.ex12");
   
   for (Class clazz : classes) {
  	WebServlet anno =(WebServlet)clazz.getAnnotation(WebServlet.class);
  	if(anno == null) continue;
  	servletMap.put(anno.url(),(Command)clazz.newInstance());
  	 
   }
    
  }
  
  public void listen() throws Exception {
    ServerSocket serverSocket = new ServerSocket(this.port);
    System.out.println("서버 실행 중...");
    
    while (true) {
      new HttpProcessor(serverSocket.accept(), servletMap).start();
    }
  }
  
  private void findClassFile(File path, String packageName) throws Exception {
  	File[] files = path.listFiles((File pathname) -> {
  			 if(pathname.isDirectory())
  				 return true;
  			 if (pathname.getName().endsWith(".class")&&
  					 pathname.getName().indexOf('$') < 0 )
  				 return true;
  			 return false;
  		 	});
  	
  	for (File file : files) {
  		if (file.isDirectory()){
  			findClassFile(file, packageName);
  			
  	}else {
  			String classFullName = file.getCanonicalPath()
  															.replaceAll("\\\\", "/")
  															.replaceAll(this.currBinDirPath, "")
														  	.replaceAll("/", ".")
														  	.replaceAll(".class", "");
  			if(classFullName.startsWith(packageName)) {
  				classes.add(Class.forName(classFullName));
  			}
  	 }	
  	}
  }
  
  public static void main(String[] args) throws Exception {
    HttpServer server = new HttpServer(8888);
    server.listen();
  }
  
}










