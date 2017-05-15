/* 인스턴스 메서드와 this 변수
 *
 */
package step07;

public class Test04_2 {
  static class Calculator {  	
    int result;
     
    Calculator(int value) {
    	 result = value;
    }
     
    public void plus(int value) {
    	 result += value;
    }
     
    public void minus(int value) {
    	 result -= value;
    }
 }
  
 public static void main(String[] args) {
  Calculator c1 = new Calculator(10);
  c1.plus(10); 
  System.out.println(c1.result);


 }
}
