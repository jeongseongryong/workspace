/* 인스턴스 변수와 클래스 메서드
 * 클래스 메서드(=스태틱 메서드)
 */
package step07;

public class Test04_8 {
  static class Calculator {  	
    int result;
     
    public static void plus(int value) {
    	//result += value;
    }
     
    public static void minus(int value) {
    	//result -= value;
    }
 }
  
 public static void main(String[] args) {
	Calculator.plus(10); 
  //System.out.println(Calculator.result);

  }
}