/* 소켓 프로그래밍 : connectionful 서버 만들기
 * => 한 번 서버와 연결되면 명시적으로 연결이 끊을 때 까지 데이터를 주고 받는 방법
 */
package step18;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.google.gson.Gson;

public class chtting_hw {

	class MessageSever implements Runnable {
		Socket socket;
		String address;
		PrintStream out;
		
		public MessageSever(Socket socket) {
			this.socket = socket;
			this.address = ((InetSocketAddress)socket.getRemoteSocketAddress()).getHostString();
			System.out.println("=>클라이언트와 연결 되었음");
		}
		
		public void run() {
			try (
				Socket socker = this.socket;
				BufferedReader in = new BufferedReader(
														new InputStreamReader(socket.getInputStream()));
				PrintStream out = new PrintStream(socket.getOutputStream());			
			) {
				this.out = out;
				String name = in.readLine();
				out.printf("[%s:%s]님이 입장하셨습니다.\n", name, address);
				
				while (true) {
				String message = in.readLine();
				if (message == null)
					break;
				
				sendAll(String.format("[%s:%s] %s" ,name, address, message));
				
				}
				System.out.println("=> 클라이언트와 연결 끊김");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void send(String message) throws Exception {
			
			out.println(message);	
			out.flush();
		}
	}
  
	ArrayList<MessageSever> messageServer =new ArrayList<>();
	
	
  public void listen(int port) throws Exception {
  	ServerSocket serverSocket = new ServerSocket(port);
  	System.out.println("서버 실행 중...");
  	while (true) {
  	new Thread(new MessageSever(serverSocket.accept())).start(); 
  	 
  	}	
  }
  synchronized public void sendAll(String message) {
  	for(int i = messageServer.size() -1; i >= 0; i--) {
  		try {
  			messageServer.get(i).send(message);
  			System.out.println(message);
  		} catch (Exception e) {
  			messageServer.remove(i);
  		}
  	}
  }
  
  
  public static void main(String[] args) throws Exception {
    chtting_hw server = new chtting_hw();
    server.listen(8888);
   
  }
}








