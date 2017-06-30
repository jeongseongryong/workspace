/* 멀티 태스킹 : 스레드의 우선 순위 */

package step19;

public class Test04 {
  static class MyThread extends Thread {
    
    public MyThread (String name) {
      this.setName(name);
    }
    
    public void run() {
      for (int i = 0; i < 1000; i++) {
        System.out.printf("[%s] %d\n", this.getName(), i);
      }
    } // run()
    
  } // class MyThread 쓰레드 상속
  
  public static void main(String[] args) {
    System.out.println("step19 Test04 실행중");
    System.out.println();
    
    MyThread t1 = new MyThread("t1");
    MyThread t2 = new MyThread("t2");
    MyThread t3 = new MyThread("t3");
    Thread main = Thread.currentThread();
    
    System.out.printf("t1 = %d\n", t1.getPriority());
    System.out.printf("t2 = %d\n", t2.getPriority());
    System.out.printf("t3 = %d\n", t3.getPriority());
    System.out.printf("main = %d\n", main.getPriority());
    
    
  }
}
