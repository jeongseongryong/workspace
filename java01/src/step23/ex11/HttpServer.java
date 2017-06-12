/* 웹 애플리케이션 실행하기
 * 1) 클라이언트가 요구하는 자원의 경로를 알아내기
 * 2) 클라이언트가 요청한 자원을 처리한다.
 * 3) HttpProcesor 클래스를 패키지 멤버 클래스로 분리
 * 4) Command 패턴 적용
 * 5) 서블릿 객체 생성 자동화
 */
package step23.ex11;

import java.io.FileReader;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;


public class HttpServer {
  int port;
  HashMap<String, Command> servletMap = new HashMap<>();
  
  public HttpServer(int port) throws Exception {
    this.port = port;
    
    Properties props = new Properties();
    
    props.load(new FileReader("src/step23/ex11/web.properties"));
    
    Set<String> urlSet = props.stringPropertyNames();
    for (String url : urlSet) {
    	String classFullName = props.getProperty(url);
    	Class clazz = Class.forName(classFullName);
    	servletMap.put(url, (Command)clazz.newInstance());
    }
  }
  
  public void listen() throws Exception {
    ServerSocket serverSocket = new ServerSocket(this.port);
    System.out.println("서버 실행 중...");
    
    while (true) {
      new HttpProcessor(serverSocket.accept(), servletMap).start();
    }
  }
  
  public static void main(String[] args) throws Exception {
    HttpServer server = new HttpServer(8888);
    server.listen();
  }
  
}










