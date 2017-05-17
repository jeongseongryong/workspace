/* 클래스 메서드들 끼리 호출하기
 * => 메서드에서 다른 메서드를 호출하는 것은 당연히 가능
 */
package step07;

public class Test04_10 {
  static class Calculator {  
  	int value;
  	
  	Calculator(int value) {
  		//Calculator.this.value = value;
  		this.value = value; //보통은 클래스명을 생략
  	}
  	
    public void m1() {
    	/*Calculator.this.*/m2();
    }
     
    public void m2() {
    	Calculator.this.m3();
    }
    public void m3() {
    	System.out.println(value);
    }
 }
  
 public static void main(String[] args) {
	Calculator c1 = new Calculator(100);
	Calculator c2 = new Calculator(200);
	Calculator c3 = new Calculator(300);
	c1.m1();
	c2.m1();
	c3.m1();

  }
}