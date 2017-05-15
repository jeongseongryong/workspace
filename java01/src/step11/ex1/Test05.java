/* 캡슐화(encapsulation) : modifier 종류 III
 * 
 */
package step11.ex1;

import step11.ex1.A;
	
public class Test05 extends A{
	
	public static void main(String[] args) {
		A obj = new A();
		// obj.v1 = 1; //private
		obj.v2 = 2; // (default). A와 같은 패키지에 있는 클래스이다.
		obj.v3 = 3; // protected. A와 같은 패키지에 있는 클래스이다.
		obj.v4 = 4; // public 
	}
}
