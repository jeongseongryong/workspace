/* 소켓 프로그래밍 : 채팅 서버 만들기 v2
 * =>다른 ChatJob들의 연락처를 구축하여 공유한다.
 * 
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

public class Test08_2 {
	class ChatJob implements Runnable {
		Socket socket;
		String address;
		PrintStream out;
		
		public ChatJob(Socket socket) {
			this.socket = socket;
			this.address = ((InetSocketAddress)socket.getRemoteSocketAddress()).getHostString();
			chatJobs.add(this);
		}
		
		public void run() {
			try (
				Socket socker = this.socket;
				BufferedReader in = new BufferedReader(
														new InputStreamReader(socket.getInputStream()));
				PrintStream out = new PrintStream(socket.getOutputStream());			
			) {
				this.out = out;
				String alias = in.readLine();
				sendAll(String.format("[%s:%s]님이 입장하였습니다.", alias, address));
				
				while (true) {
				String message = in.readLine();
				if (message == null)
					break;
				
				
				sendAll(String.format("[%s:%s] %s", alias, address, message));
				
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void send(String message)throws Exception {
			
				out.println(message);
				out.flush();
		}
	}

	ArrayList<ChatJob> chatJobs =new ArrayList<>();

  public void listen(int port) throws Exception {
  	ServerSocket serverSocket = new ServerSocket(port);
  	System.out.println("서버 실행 중...");
  	while (true) {
  	new Thread(new ChatJob(serverSocket.accept())).start(); 
  	
  	}	
  }
  
  
 synchronized public void sendAll(String message) { 
  		for (int i = chatJobs.size() -1; i >= 0; i--) {
  			try {
  				chatJobs.get(i).send(message);
  				System.out.println(message);
  			} catch (Exception e) {
  				chatJobs.remove(i);
  			}
  		}
  	}
  // 프로그램 실행시 예외발생시 시스템을 멈추지않고 적당한 조치후 계속 실행을하는 문법(try{}catch() {})
  
  public static void main(String[] args) throws Exception {
    Test08_2 server = new Test08_2();
    server.listen(8888);
   
   
  }
  
}








