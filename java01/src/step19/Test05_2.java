/* 멀티 태스킹 : Critical Section(Critical Region) II
 * synchronized 크리티컬 섹션을 실행시 ,한 번에 한 스레드 만이 진입하게 만드는 방법
 * =>용어
 * 	뮤텍스 (Mutex; mutual exclusion;상호배제)
 * 	세마 포어(semaphore) 자바에서는 이방식을 지원 하지않는다.
 */
package step19;

import step19.Test04.MyThread;

public class Test05_2 {

	static class Account {
		long balance;

		public Account(long balance) {
			this.balance = balance;
		}
		// Critical Section에 여러 스레드가 동시에 진입하지 못하게 막는방법
		// => 그 메서드나 블록앞에 synchronized 를 붙인다.
		synchronized public long withdraw(long money) {
			long temp = this.balance;

			// 약간의 시간 지연을 발생 시킴
			// 일부로 다른 스레드에게 CPU 사용권을 뻇기기 위함.
			double x = 3.141592;
			int delayCount = (int)(Math.random() * 10);
			for(int i = 0; i < delayCount; i++)
				x /= 345.2345;
			//--------------------------------------------

			temp -= money;

			if(temp >= 0) {
				this.balance = temp;
				return money;

			}
			return 0;
		}

	}

	static class ATM extends Thread {
		Account account;

		public ATM(String name, Account account) {
			super(name);
			this.account = account;
		}

		public void run() {
			long sum = 0;
			for (int i = 0; i < 10000; i++) {
				long money = this.account.withdraw(100);
				if (money == 0)
					break;
				sum += money;

			}
			System.out.printf("%s = %d\n",this.getName(), sum);
		}
	}

	public static void main(String[] args) {
		Account account = new Account(1_000_000);
		ATM t1 = new ATM("강남", account );
		ATM t2 = new ATM("강북", account);
		ATM t3 = new ATM("강원", account);
		ATM t4 = new ATM("제주", account);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}









