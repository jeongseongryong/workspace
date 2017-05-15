/* 캡슐화(encapsulation) : modifier 종류 II
 * 
 */
package step11;

import step11.ex1.A;
	
public class Test04 extends A{
	
	public void test() {
		//this.v1 = 1; // private
		//thus.v2 = 2; // (default)
		this.v3 = 3; // protected. 상속 받아서 만든 변수이기 때문에 가능
		this.v4 = 4; // public
	}
	public static void main(String[] args) {
		A obj = new A();
		// obj.v1 = 1; //private
		// obj.v2 = 2; // (default)
		// obj.v3 = 3; // protected // 상속 받아서 만든 변수에 대해서만 가능.
		obj.v4 = 4; // public
	}
}
