/* 멀티 태스킹 : 스레드의 라이플 사이클

 */
package step19;

public class Test06 {

	static class Worker {
		public void play() {
			System.out.println("오호라~~놀자");
		}
	}

	static class MyThread extends Thread {
		Worker worker;

		public MyThread(Worker worker) {
			this.worker = worker;
		}

		public void run() {
			while(true) {
				worker.play();
				try {
					Thread.sleep(1000);      		
				} catch (Exception e) {}
			}
		}
	}

	public static void main(String[] args) {
		Worker worker = new Worker();
		MyThread t1 = new MyThread(worker);
		
		t1.start();
		// "main" 스레드는 t1 스레드를 실행시켜 놓고,main() 메서드 호출을 끝낸다.
		// 그런데 JVM이 종료되지 않고 계속실행
		// "main" 스레드는 자식스레드가 종료될 때 까지 JVM을 종료하지 않음
		System.out.println("main 끝~");
	}
}









