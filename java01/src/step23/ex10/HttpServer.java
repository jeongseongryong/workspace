/* 웹 애플리케이션 실행하기
 * 1) 클라이언트가 요구하는 자원의 경로를 알아내기
 * 2) 클라이언트가 요청한 자원을 처리한다.
 * 3) HttpProcesor 클래스를 패키지 멤버 클래스로 분리
 * 4) Command 패턴 적용
 */
package step23.ex10;

import java.net.ServerSocket;
import java.util.HashMap;


public class HttpServer {
  int port;
  HashMap<String, Command> servletMap = new HashMap<>();
  
  public HttpServer(int port) {
    this.port = port;
    
    servletMap.put("hello", new HelloServlet());
    servletMap.put("ok", new OkServlet());
    servletMap.put("error", new ErrorServlet());
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










