/* 클래스 변수와 클래스 메서드 2
 *
 */
package step07;

public class Test04_5 {
  static class Calculator {  	
    static int result;
     
    public static void plus(int value) {
    //this.result += value; //클래스 메서드나 static 블록에서는 this 변수가 없다.
    	//this가 생략된것이아니라 클래스 이름이 생략된것
    	result += value;
    }
     
    public static void minus(int value) {
    	result -= value;
    }
 }
  
 public static void main(String[] args) {
  Calculator.plus(10); 
  System.out.println(Calculator.result);

  }
}
